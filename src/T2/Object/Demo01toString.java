package T2.Object;
/*
java.lang.Object
类Object是类层次结构的根类
每个类都是Object的子类
所有对象（包括数组）都实现这个类的方法。
 */
public class Demo01toString {
    public static void main(String[] args) {
        Person person = new Person("杨幂",20);
        String s = person.toString();
        System.out.println(s);//直接打印对象的名字，就是调用对象的toString方法
        System.out.println(person);
    }
}
