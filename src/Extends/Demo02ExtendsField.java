package Extends;
/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，有两种访问方式：
1，直接通过子类对象访问成员对象：
    等号左边是谁，就优先用谁，没有则向上找；
2，间接通过成员方法访问成员变量
    该方法属于谁，就优先使用谁的，没有则向上找


 */
public class Demo02ExtendsField {
    public static void main(String[] args) {
        Fu_1 fu = new Fu_1();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容

        Zi_1 zi = new Zi_1();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20

        System.out.println("===================");
        //直接通过子类对象访问成员对象：
        System.out.println(zi.num);//优先子类，200
        System.out.println("=====================");

        //这个方法是子类的，优先使用子类的，没有再向上找
        zi.methodZi();//200
        //这个方法在父类当中定义的，使用的也是父类的num
        zi.methodFu();//100

    }
}
