package String;
/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
1，public boolean equals（Object obj）：参数可以是任何对象，只有参数
是一个字符串并且内容相同的才会给true，否则返回false
注意事项：
1，任何对象都能用Object进行接收。
2，equals方法具有对称性，，也就是说a.equals(b)和b.equals(a)效果一样
3，如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐："abc".equals(str5)
不推荐：str5.equals("abc")

2，public boolean equalsIgnoreCase(String str):忽略大小写进行内容比较

 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true

        String str4 = "hello";
        System.out.println(str1.equals(str4));/* false */
        System.out.println("==============================");

        String str5 = "abc";
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));//不推荐,如果是str5是null，会报空指针异常的错误

        System.out.println("===============================");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//false 严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//true  忽略大小写

    }
}
