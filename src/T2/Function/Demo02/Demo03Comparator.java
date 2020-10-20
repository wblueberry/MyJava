package T2.Function.Demo02;

import java.util.Comparator;

/*
如果一个方法的返回值是一个函数式接口，那么就可以直接返回一个Lambda表达式。
需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时。可以调用该方法获取
 */
public class Demo03Comparator {
    //定义一个方法，方法返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口，就可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s, String t) {
//                //按照字符串的降序排序
//                return t.length()-s.length();
//            }
//        };
        //使用lambda优化
        return (String s, String t)->{
            //按照字符串的降序排序
            return t.length()-s.length();
        };
    }
}
