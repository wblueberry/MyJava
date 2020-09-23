package T2.Thread.Lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
            }
        }).start();


        //使用Lambda表达式实现多线程
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
            }
        ).start();
    }
}
