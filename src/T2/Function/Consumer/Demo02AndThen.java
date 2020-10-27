package T2.Function.Consumer;

import java.util.function.Consumer;

/*
Consumer 接口的默认方法andThen
作用：需要两个Consumer接口，可以把两个接口组合到一起，对数据进行消费
例如：
Consumer<String> con1
Consumer<String> con2
String s = "hello";
con1.accept(s);
con2.accept(s);
等同于如下（先连接再消费，前面的先消费）：
con1.andThen(con2).accept(s);
 */
public class Demo02AndThen {
    //定义一个方法，参数传递一个字符串和两个Consumer接口，泛型使用String
    public static void method(String n, Consumer<String> con1,Consumer<String> con2){
       //con1.accept(n);
        //con2.accept(n);
        //使用andThen方法
        con1.andThen(con2).accept(n);//con1连接con2,先消费con1
        //可以用两个andThen连接更多的接口
        //con1.andThen(con2).andThen(con3)...
    }

    public static void main(String[] args) {
        //调用method方法，传递一个字符串和两个Lambda表达式
        method("hello",
                (t)->{
                    //消费方式：把字符串转换为大写
                    System.out.println(t.toUpperCase());
        },
                (t)->{
                    //消费方式：把字符串转换为小写
                    System.out.println(t.toLowerCase());
        });
    }
}
