package T2.Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = null;
        boolean b = s1.equals(s2);
        System.out.println(b);
        /*Objects类的equals方法：对两个对象进行比较，防止空指针异常*/
        boolean b2 = Objects.equals(s1,s3);
        System.out.println(b2);
    }
}
