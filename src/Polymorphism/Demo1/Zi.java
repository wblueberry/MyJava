package Polymorphism.Demo1;

public class Zi extends Fu{
    int num = 20;

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }

}

