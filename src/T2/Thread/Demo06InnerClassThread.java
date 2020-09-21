package T2.Thread;
/*
匿名内部类方式实现线程的创建
匿名：没有名字
内部类：写在其他类内部的类

匿名内部类的作用：简化代码
    把之类继承父类，重写父类的方法，创建子类对象一步完成
    把实现类实现接口，重写接口中的方法，创建实现类对象一步完成
匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

格式：
    new 父类/接口（）{
        重复父类/接口中的方法
    };


 */
public class Demo06InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
          //重写run方法，设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();//大括号里面是一个子类对象，还要调用start方法才能开启线程

        //线程的接口Runnable
        //Runnable r = new RunnableImpl（） 多态
        Runnable r = new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->程序员"+i);
                }
            }
        };
        //开启线程
        new Thread(r).start();

        //简化接口的方式
        new Thread(new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->你好"+i);
                }
            }
        }).start();//用new的东西替换掉r
    }
}
