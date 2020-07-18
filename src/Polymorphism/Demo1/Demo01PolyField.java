package Polymorphism.Demo1;
/*
访问成员变量的两种方式：
1，直接通过对象名访问成员变量：看等号左边是谁，优先用谁，没有则向上找
2，间接通过成员方法访问成员变量,该方法属于谁，优先用谁，没有则向上找
 */
public class Demo01PolyField {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();//父类的num
        System.out.println(obj.num);
        obj.showNum();//父类的，如果子类覆盖重写了，就用子类的方法
    }
}
