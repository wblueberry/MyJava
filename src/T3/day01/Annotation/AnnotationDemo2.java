package T3.day01.Annotation;
/*
JDK中预定义的一些注解：
    1，@Override：用于标识方法，标识该方法属于重写父类的方法
    2，@Deprecated：用于标识方法或类，标识该类或方法已过时，建议不要使用
    3，@SuppressWarnnings:用于有选择的关闭编译器对类、方法、成员变量、变量初始化的警告

 */
@SuppressWarnings("all")
public class AnnotationDemo2 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
        System.out.println("show1...");
    }

    public void show2(){
        System.out.println("show2....");
    }
}
