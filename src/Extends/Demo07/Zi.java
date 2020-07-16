package Extends.Demo07;

public class Zi extends Fu {
    public Zi(){
        //super();//在调用父类无参构造函数，不写的话编译器默认有
        super(10);//在调用父类重载的构造方法
       System.out.println("子类构造方法");
    }
}
