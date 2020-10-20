package T2.Net.BS;

import java.io.*;
import java.net.ServerSocket;

import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket，跟系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        /*
        浏览器解析服务器回写的html界面，页面中如果有图片，那么浏览器就会单独开启一个线程，读取服务器中的图片
        我们就让服务器一直处于监听状态，客户端请求一次，服务器就回写一次
         */
        while(true){
            //使用accept方法获取请求的客户端对象（浏览器）
            Socket socket = server.accept();

            //开启线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();

                        //把is网络直接输入流对象，转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求信息的第一行读取出来 GET /Net/BS/web/index.html HTTP/1.1
                        //http://127.0.0.1:8080/src/T2/Net/BS/web/index.html
                        String line = br.readLine();
                        System.out.println(line);
                        //把读取的信息进行切割，只要中间的部分 /Net/BS/web/index.html
                        String[] arr = line.split(" ");//根据空格来切割
                        //把路径前面的/去掉，进行截取
                        String htmlpath = arr[1].substring(1);//Net/BS/web/index.html

                        //创建一个本地的字节流，构造方法中绑定要读取的html路径
                        FileInputStream file = new FileInputStream(htmlpath);
                        //使用Socket中的方法getOutputStream获取网络字节输出流对象
                        OutputStream os = socket.getOutputStream();

                        //写入HTTP协议响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须要写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());

                        //一读一写复制文件，把服务器读取的html文件回写到客户端
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = file.read(bytes))!=-1){
                            os.write(bytes,0,len);
                        }

                        //释放资源
                        file.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();


        }

        //server.close();
    }
}
