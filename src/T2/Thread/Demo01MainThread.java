package T2.Thread;
/*
主线程：执行主（main）方法的线程
单线程程序：Java工程中只有一个线程
执行从main方法开始，从上到下一次执行。
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Demo01Person p1 = new Demo01Person("张三");
        p1.run();
        //System.out.println(0/0);

        Demo01Person p2 = new Demo01Person("李四");
        p2.run();
    }
}
