package T3.day01.reflect;

import T3.day01.Demo.Person;

import java.lang.reflect.Constructor;

/*
2，获取构造方法们
     1，Constructor<?>[] getConstructors()
     返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。
     2，Constructor<T> getConstructor(Class<?>... parameterTypes)
     返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
     3，Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
     返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
     4，Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
     返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class person = Person.class;

        //1，Constructor<?>[] getConstructors()
        //返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。
        Constructor constructor = person.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        //带参对象
        Object person1 = constructor.newInstance("张三", 23);
        System.out.println(person1);

        //空参对象
        Constructor constructor1 = person.getConstructor();
        Object person2 = constructor1.newInstance();
        System.out.println(person2);

    }
}
