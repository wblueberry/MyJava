package T2.Thread.Demo02Thread;
//1，创建一个Thread类的子类
public class Demo02MyThread extends Thread{
    //2，在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么？）
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("new:"+i);
        }
    }
}
