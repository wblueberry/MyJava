package T3.day01.reflect;

import T3.day01.Demo.Person;

/*
获取class对象的方式：
    1，Class.forName("全类名"):将字节码文件加载进内存，返回class对象
    2，类名.class:通过类名的属性class获取
    3，对象.getClass():getClass()方法在object中定义的
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1，Class.forName("全类名"):将字节码文件加载进内存，返回class对象
        Class aClass = Class.forName("T3.day01.Demo.Person");
        System.out.println(aClass);
        //2，类名.class:通过类名的属性class获取
        Class bClass = Person.class;
        System.out.println(bClass);
        //3，对象.getClass():getClass()方法在object中定义的
        Person p = new Person();
        Class cClass = p.getClass();
        System.out.println(cClass);

        //用==比较这三个对象
        System.out.println(aClass==bClass&&aClass==cClass);
    }
}
