package T2.StringBuilder;
/*
StringBuilder和String可以相互转换：
String->StringBuilder:可以使用StringBuilder的构造方法
StringBuilder->String：将当前StringBuilder对象转换为String对象
 */
public class StringBuilder_toString {
    public static void main(String[] args) {
        //String->StringBuilder
        String str = "hello";
        System.out.println(str);
        StringBuilder bu1 = new StringBuilder(str);
        bu1.append("world");
        System.out.println(bu1);

        //StringBuilder->String
        String s = bu1.toString();
        System.out.println(s);

    }
}
