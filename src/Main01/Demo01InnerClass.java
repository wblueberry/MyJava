package Main01;
/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类
例如：身体和心脏的关系

分类：
1，成员内部类
2，局部内部类（包含匿名内部类）

成员内部类的定义格式：
修饰符 class 外部类名称{
    修饰符 class 内部类名称{//...}
}

注意：内用外，随意访问，权限不受影响；外用内，需要内部类对象。

如何使用成员内部类？有两种方式：
1，间接方式:在外部类的方法中使用内部类，main方法调用外部类的方法
2，直接方式：公式：
类名称 对象名 = new 类名称（）；一般
【外部类名称.内部类名称 对象名 = new 外部类名称（）.new 内部类名称（）；】

 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();//创建外部类的对象
        //通过外部类对象调用外部类方法，里面间接使用内部类的方法
        body.methodBody();
        System.out.println("================================");
        //外部类名称.内部类名称 对象名 = new 外部类名称（）.new 内部类名称（）；
        Body.Heart heart = new Body().new Heart();
        heart.beat();//直接访问内部类


    }
}
