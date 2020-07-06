package String;
/*
字符串的截取方法：

public String substring(int index):截取从参数位置一直到字符串末尾，返回新的字符串。
public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串
注意：[begin,end),包含左边，不包含右边
 */
public class Demo05Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//不变
        System.out.println(str2);//新的字符串
        System.out.println("=================================");

        String str3 = str1.substring(4,7);
        System.out.println(str3);//oWo


        //下面这种写法，字符串的内容任然是没有改变的
        //下面有；两个字符串：”Hello“，”Java“
        //strA当中保存的是地址值，本来地址是Hello的地址，后来换成了Java的地址值
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);

    }
}
