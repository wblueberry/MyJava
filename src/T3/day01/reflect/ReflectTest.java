package T3.day01.reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
框架类
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        //可以创建任意类的对象，可以执行任意方法
        //1,加载配置文件
        //创建Properties对象
        Properties pro = new Properties();
        //加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //加载该类进内存
        Class cls = Class.forName(className );
        //创建对象
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
