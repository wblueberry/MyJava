package Object;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
1，导包：指出需要使用的类，在什么位置
import 包名称.类名称
对于和当前类属于同一个包的情况，可以省略导包语句
2，创建：
格式：类名称 对象名 = new 类名称（）；
Student stu = new Student（）；

3，使用的两种情况：
    1，使用成员变量：对象名.成员变量名
    2，使用成员方法：对象名.成员方法名（参数）

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样

 */
public class Demo02Student {
    public static void main(String[] args) {
        //1,导包（同一个包下面，不用导）
        //2，创建，格式：
        //类名称 对象名 = new 类名称（）；
        Student stu = new Student();
        //3,使用其中成员变量，格式：对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=====================");
        stu.age=24;
        stu.name="鞠婧祎";
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=====================");
        //使用对象的成员方法，格式：
        //对象名.成员方法名（）
        stu.eat();
        stu.sleep();
        stu.study();



    }
}
