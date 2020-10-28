package T3.day01.reflect;

import T3.day01.Demo.Person;

import java.lang.reflect.Field;
import java.util.Objects;

/*
Class对象的功能：
        获取功能：
            1，获取成员变量们
                 1，Field getField(String name)
                    返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。
                 2，Field[] getFields()
                    返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
                 3，Field getDeclaredField(String name)
                    返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。
                 4，Field[] getDeclaredFields()
                    返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。
            2，获取构造方法们
                 1，Constructor<?>[] getConstructors()
                    返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。
                 2，Constructor<T> getConstructor(Class<?>... parameterTypes)
                    返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
                 3，Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
                    返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
                 4，Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
                    返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
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
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class person = Person.class;
        //1，Field getField(String name),就是说获取public修饰的成员变量
        //返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。
        Field[] fields = person.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //2，Field[] getFields()
        //返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
        Field a = person.getField("a");
        System.out.println(a);
        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"张三");
        System.out.println(p);
        System.out.println("========================================");

        //4，Field[] getDeclaredFields() 获取所有的成员变量，不考虑修饰符
        //返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。
        Field[] field1 = person.getDeclaredFields();
        for (Field field : field1) {
            System.out.println(field);
        }

        //3，Field getDeclaredField(String name)
        //返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。
        Field d = person.getDeclaredField("d");
        //忽略访问权限修饰符的检查
        d.setAccessible(true);//暴力反射

        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
