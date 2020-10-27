package T2.Function.Predicate;

import java.util.function.Predicate;

/*
逻辑表达式：可以连接多个判断条件
&&与运算 and
||或运算 or
! 非 negate
 */
public class Demo02And {
    public static boolean checkString(String s, Predicate<String> pre1 , Predicate<String> pre2){
//        return pre1.test(s) && pre2.test(s);
//        return pre1.and(pre2).test(s);//与
//        return pre1.or(pre2).test(s);//或
        return pre1.negate().test(s);

    }


    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s,
                (String str1)-> str1.length()>5,
                (String str2)-> str2.contains("a")
        );

        System.out.println(b);
    }
}
