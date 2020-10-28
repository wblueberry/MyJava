package T3.day01.reflect;

import T3.day01.Demo.Person;

import java.lang.reflect.Method;

/*
3，获取成员方法们
    1， Method getMethod(String name, Class<?>... parameterTypes)
    返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
    2，Method[] getMethods()
    返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口
    （包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。
    3， Method getDeclaredMethod(String name, Class<?>... parameterTypes)
    返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
     4，Method[] getDeclaredMethods()
    返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，
    包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class person = Person.class;
        //1， Method getMethod(String name, Class<?>... parameterTypes)
        //返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
        Method eat = person.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat.invoke(p);

        //获取带有参数的方法
        Method eat1 = person.getMethod("eat",String.class);
        //执行方法
        eat1.invoke(p,"rice");
        System.out.println("======================================");


        //获取所有public修饰的方法
        Method[] methods = person.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }
    }
}
