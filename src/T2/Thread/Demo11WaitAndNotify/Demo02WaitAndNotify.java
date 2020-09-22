package T2.Thread.Demo11WaitAndNotify;
/*
进入到TimeWaiting（计时等待）有两种方式
1，使用sleep（long m）方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
2,使用wait（Long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，
线程睡醒进入到Runnable/Blocked状态
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建一个顾客线程（使用匿名内部类）
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while (true){
                    //保证等待和唤醒的线程只有一个能执行
                    synchronized (obj){
                        System.out.println("告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃");
                        System.out.println("---------------------------------------");
                    }
                }
            }
        }.start();

    }
}
