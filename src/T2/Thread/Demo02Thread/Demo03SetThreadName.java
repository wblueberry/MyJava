package T2.Thread.Demo02Thread;

public class Demo03SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        Demo03MyThread mt = new Demo03MyThread();
        mt.setName("张三");
        mt.start();

        //开启多线程
        new Demo03MyThread("李四").start();
    }
}
