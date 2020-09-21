package T2.Thread.Demo02Thread;
/*
创建多线程的第一种方式：创建  thread类的子类
java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类

实现步骤：
    1，创建一个Thread类的子类
    2，在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么？）
    3，创建Thread类的子类对象
    4，调用Thread类中的方法start方法，开启新线程，执行run方法
        void start() 使櫭线程开始执行，java虚拟机调用该线程的run方法
        结果是两个线程并发地运行；当前线程（main线程）（从调用返回给start方法）和
        另一个线程（创建的新线程，执行其run方法）。
       多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
java程序属于抢占式调度，哪个线程的优先级高，哪个线程就优先执行。同一个优先级，随机选择一个执行。
 */
public class Demo02Thread {
    public static void main(String[] args) {
        //3，创建Thread类的子类对象
        Demo02MyThread mt = new Demo02MyThread();
        //4，调用Thread类中的方法start方法，开启新线程，执行run方法
        mt.start();

        //主线程的程序：
        for (int i = 0; i < 10; i++) {
            System.out.println("main:"+i);
        }
    }
}
