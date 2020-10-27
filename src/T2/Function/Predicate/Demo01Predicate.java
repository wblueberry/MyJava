package T2.Function.Predicate;

import java.util.function.Predicate;

/*
java.util.function.Predicate<T>接口
作用：对某种数据进行判断，结果返回布尔值

 */
public class Demo01Predicate {
    //定义一个方法，参数传递字符串，传递Predicate接口，泛型用String
    public static  boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";

        boolean b = checkString(s,(String str)->{
            //对参数传递的字符串进行判断
            return str.length()>5;
        });

        System.out.println(b);
    }
}
