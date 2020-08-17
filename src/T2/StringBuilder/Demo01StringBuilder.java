package T2.StringBuilder;
/*
构造方法摘要
StringBuilder()
          构造一个其中不带字符的字符串生成器，初始容量为 16 个字符。
StringBuilder(CharSequence seq)
          构造一个字符串生成器，包含与指定的 CharSequence 相同的字符。
StringBuilder(int capacity)
          构造一个其中不带字符的字符串生成器，初始容量由 capacity 参数指定。
StringBuilder(String str)
          构造一个字符串生成器，并初始化为指定的字符串内容。

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参数构造方法：
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);

        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("hello");
        System.out.println(bu2);
    }

}
