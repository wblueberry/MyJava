package T3.day01.reflect;

import T3.day01.Annotation.Pro;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


@Pro(className = "T3.day01.Annotation.Demo1",methodName = "show")
public class ReflectTest2 {
    public static void main(String[] args) throws Exception {
        //解析注解
        //获取该类的字节码文件对象
        Class<ReflectTest2> reflectTest2Class = ReflectTest2.class;
        //获取上边的注解对象
        //其实就是在内存中去生产了一个该注解接口的子类实现类对象
        Pro an = reflectTest2Class.getAnnotation(Pro.class);
        //调用注解对象中定义的抽象方法获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //加载该类进内存
        Class cls = Class.forName(className );
        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
