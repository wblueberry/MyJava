package T2.Function.Function;

import java.util.function.Function;

/*
组合两个function接口
 */
public class Demo02AndThen {
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
       String s = "1234";
       change(s,(String str)-> Integer.parseInt(str)+10,(Integer in)-> in+"");
    }
}
