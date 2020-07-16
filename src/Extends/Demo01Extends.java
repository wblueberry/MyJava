package Extends;
/*
在继承的关系中，子类就是一个父类，也就是说子类可以被当做父类看待

定义父类的格式：（一个普通的类定义）
public class ...
定义子类的格式：
public class 子类名称 extends 父类名称 {

}

 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //teacher当中虽然什么都没写，但是会继承来自父类的method方法
        teacher.method();

        //创建另一个子类助教对象
        Assistant ass = new Assistant();
        ass.method();
    }
}
