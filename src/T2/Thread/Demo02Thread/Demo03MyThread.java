package T2.Thread.Demo02Thread;
/*
设置线程的名称（了解）：
    1，使用Thread类中的方法setName（名字）
        void setName(String name) 改变线程的名称，使之与参数name相同
    2，创建一个带参数的构造方法，参数传递线程的名称
    调用父类的带参数构造方法，把线程名称传递给父类，让父类（Thread）给子线程起一个名字
    Thread(String name) 分配新的Thread对象
 */
public class Demo03MyThread extends Thread{

    public Demo03MyThread(){
    }

    //把线程名称传递给父类，让父类（Thread）给子线程起一个名字
    public Demo03MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
