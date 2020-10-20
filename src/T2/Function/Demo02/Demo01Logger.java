package T2.Function.Demo02;
/*
日志案例
 */
public class Demo01Logger {
    //定义一个方法，根据日志级别，显示日志信息的方法
    public static void showlog(int level,String msg) {
        //对日志的等级进行判断
        if(level == 1){
            System.out.println(msg);
        }

    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showlog方法，传递日志的等级和信息
        showlog(1,msg1+msg2+msg3);


    }

}
