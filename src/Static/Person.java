package Static;

public class Person {
    static {
        System.out.println("静态代码块执行啦");
    }
    public  Person(){
        System.out.println("构造方法执行啦");
    }
}