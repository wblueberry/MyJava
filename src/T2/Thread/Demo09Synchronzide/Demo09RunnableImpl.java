package T2.Thread.Demo09Synchronzide;
/*
实现卖票案例出现了安全问题
卖出了不存在的票还有重复的票

解决线程安全问题的第二种方式：使用同步代方法
使用步骤：
    1，把访问了共享数据的代码抽取出来，放到一个方法中
    2,在方法上添加synchronized修饰符
格式：定义方法的格式
修饰符 synchronized 返回值类型 方法名（参数）{方法体}
 */
public class Demo09RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private static int ticket = 100 ;

    //创建一个锁对象
    Object obj = new Object();


    //设置线程任务：卖票
    @Override
    public void run() {
        System.out.println("this:"+this);
       //使用死循环，让卖票操作重复执行
        while (true){
            payTicketStatic();
        }
    }


    //静态的同步方法，锁对象不能是this，this是创建对象才产生的，静态方法优先于对象
    //静态方法的锁对象是本类的class属性-->class文件对象（反射）
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (Demo09RunnableImpl.class){
            //判断票是否存在：
            if(ticket >0){
                //为了提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，卖票
                System.out.println(Thread.currentThread().getName()+"-->"+"正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }

    //定义一个同步方法
    //同步方法也会把方法内部的代码锁住，只让一个县城执行，同步方法的锁对象就是实现类对象new Runnable
    //也就是this
    public synchronized void payTicket(){
        //判断票是否存在：
        if(ticket >0){
            //为了提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            //票存在，卖票
            System.out.println(Thread.currentThread().getName()+"-->"+"正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
