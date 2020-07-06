package String;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母，小写字母。数字，其他

分析：
1，既然用到了键盘输入，肯定是scanner
2，键盘输入的是字符串，那么：String str = sc.next();
3,定义四个变量，分别代表四种字符串各自出现的次数
4,需要对字符串一个字一个字地检查。String->char[],方法就是toCharArray()
5,遍历char[]字符数组，对当前字符的种类进行判断，并且用四个不天来那个进行++操作
6，打印输出四个变量，分别代表四种字符出现次数。
 */
public class Demo09StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();//获取从键盘输入的一个字符串

        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数字
        int countOther = 0;//其他字符

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];//当前单个字符
            if('A'<=ch && ch <='Z'){
                countUpper++;
            }else if('a'<=ch && ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母的个数："+countUpper);
        System.out.println("小写字母的个数："+countLower);
        System.out.println("数字的个数："+countNumber);
        System.out.println("其他字符的个数："+countOther);
    }
}
