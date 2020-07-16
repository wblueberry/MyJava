package Extends.Demo07;
/*
继承关系中，父子类构造方法的访问特点

1,子类构造方法当中有一个默认隐含的“super（）”调用，所以
一定是先调用父类构造，后执行子类的构造
2，子类构造可以通过super关键字调用父类的重载构造

3，super的父类构造调用，必须是子类构造方法的第一个语句。
不能一个构造调用多个super构造

4，子类必须调用构造方法，不写的话则默认有super方法，写了则用指定的，
super只能有一个，必须在第一个语句的位置

 */
public class Demo07Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
