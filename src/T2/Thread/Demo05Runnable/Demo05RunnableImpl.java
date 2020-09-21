package T2.Thread.Demo05Runnable;
//1，创建一个Runnable接口的实现类
public class Demo05RunnableImpl implements Runnable {
    //2，在实现类中重写Runnable接口的run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
