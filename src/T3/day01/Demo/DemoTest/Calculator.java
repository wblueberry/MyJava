package T3.day01.Demo.DemoTest;

public class Calculator {

    @Check
    public void add(){
        System.out.println((1+0));
    }

    @Check
    public void sub(){
        System.out.println((1-0));
    }

    @Check
    public void mul(){
        System.out.println((1*0));
    }

    @Check
    public void div(){
        System.out.println((1/0));
    }

    public void show(){
        System.out.println("没有bug...");
    }
}
