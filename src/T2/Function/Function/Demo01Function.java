package T2.Function.Function;

import java.util.function.Function;

/*
java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
前者为前置条件，后者为后置条件。
Function接口中最主要的抽象方法为：R apply(T t),根据类型T的参数获取类型R的结果，使用场景
例如：将String类型转换为Integer类型。
 */
public class Demo01Function {
    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }
    public static void main(String[] args) {
        String s = "12234";
        change(s,str->Integer.parseInt(str));
    }
}
