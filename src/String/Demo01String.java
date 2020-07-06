package String;

/*
java.lang.String类代表字符串。
API当中说：Java程序中的所有字符串吗面值（如"abc"）都作为此类的实例实现。
其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new，也照样是）

字符串的特点：
1，字符串的内容永不可变。【重点】
2，正是因为字符串不可改变，所以字符串是可以共享使用的。
3，字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组。

创建字符串的常见3+1种方式：
三种构造方法：
public String(); 创建一个空白字符串，不含任何内容。
public String(char[] array);根据字符数组的内容，来创建对应的字符串
public String(byte[] array);根据字节数组的内容，来创建对应的字符串。

一种直接创建：
String str = "Hello";//右边直接用双引号
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//小括号留空，什么内容都没有
        System.out.println("第一个字符串是："+str1);

        //根据字符串数组创建字符串
        char[] charArray =  {'A','B','C'};
        String str2  = new String(charArray);
        System.out.println("第二个字符串是："+str2);

        //根据字节数组来创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是："+str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串是："+str4);
    }
}