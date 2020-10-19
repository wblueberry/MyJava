package T2.Net.FileUpload2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
文件上传案例的服务器端：读取客户端上传的数据，保存到服务器的硬盘，给客户端回写上传成功

明确：
    数据源：客户上传的文件
    目的地：服务器的硬盘 d：//

实现步骤：
    1，创建一个服务器ServerSocket对象，和系统要指定的端口号
    2，使用socket对象中的方法accept，获取请求的客户端的socket对象
    3，使用socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
    4，判断d盘有没有相应的文件夹，如果不存在就创建文件夹
    5，创建一个本地的字节输出流FileOutputStream对象，构造方法中要绑定要输出的目的地
    6，使用网络字节输入流InputStream对象中的方法read，获取客户端上传的文件
    7，使用本地字节输出流FileOutputStream对象的方法write，把读取到的文件上传到服务器硬盘上
    8，使用socket对象中的方法getOutputStream，获取到网络字节输出流OutputStream对象
    9，使用网络字节输出流对象OutputStream对象中的方法write，给客户端回写上传成功
    10，释放资源（FileOutputStream，socket，ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1，创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //2，使用socket对象中的方法accept，获取请求的客户端的socket对象
        /*
        让服务器一直处于监听状态（死循环accept）
         */
        while(true){
            Socket socket = server.accept();
            /*
            使用多线程技术，提高程序的效率
            有一个客户端上传文件，就开启一个线程，完成文件的上传
             */
            new Thread(new Runnable() {
                //完成文件的上传
                @Override
                public void run() {
                    try{
                        //3，使用socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4，判断d盘有没有相应的文件夹，如果不存在就创建文件夹
                        File file = new File("C:\\Users\\asus\\Desktop\\speech\\Python\\server");
                        if(!file.exists()){
                            file.mkdir();
                        }
                        /*
                            自定义一个文件的命名规则，防止同名的文件被覆盖
                            规则：域名+随机数
                        */
                        String fileName = "wb"+System.currentTimeMillis()+new Random().nextInt(999)+".jpg";

                        //5，创建一个本地的字节输出流FileOutputStream对象，构造方法中要绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
                        //6，使用网络字节输入流InputStream对象中的方法read，获取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes))!=-1){
                            //7，使用本地字节输出流FileOutputStream对象的方法write，把读取到的文件上传到服务器硬盘上
                            fos.write(bytes,0,len);
                        }
                        //8，使用socket对象中的方法getOutputStream，获取到网络字节输出流OutputStream对象
                        //9，使用网络字节输出流对象OutputStream对象中的方法write，给客户端回写上传成功
                        socket.getOutputStream().write("上传成功".getBytes());
                        //10，释放资源（FileOutputStream，socket，ServerSocket）
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();


        }

        //不用关闭服务器
        //server.close();
    }
}
