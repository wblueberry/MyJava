

/*
题目要求：
根据int变量n的值，来获取随机的数字，范围是【1，n】，可以取道n
思路：
1，定义一个int变量n，随意赋值
2，要使用Random：三个步骤，导包，创建，使用
3，如果写数字10，那么就是0~9，然而想要的是1`10,可以+1实现
4，打印随机数字
 */
package API;

import java.util.Random;
public class Demo03Random {
    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
        int n =6;
        Random r = new Random();

        int num = r.nextInt(n);
        System.out.println("随机数是："+(num+1));
    }
}
