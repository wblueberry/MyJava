package T2.Thread.Demo03MyThread;
/*
线程的名称
    主线程:main
    新线程：Thread-0
 */
public class Demo03GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        Demo03MyThread mt = new Demo03MyThread();
        //调用start开启新的线程
        mt.start();

        //匿名函数
        new Demo03MyThread().start();
        new Demo03MyThread().start();

    }
}
