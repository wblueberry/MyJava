package API;

import java.util.Random;
import java.util.Scanner;

/*
猜数字

题目：
用代码实现猜数字的小游戏
思路：
1，首先需要产生一个随机数字，并且一旦产生不在改变。用Random的nextInt方法
2，需要键盘输入，所以用到了Scanner，用nextInt获取输入的数字
3，程序逻辑
4，重来
 */
public class Demo04RandomFame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();

            if(guessNum>randomNum){
                System.out.println("太大了，请重试！");
            }else if(guessNum<randomNum){
                System.out.println("太小了，请重试！");
            }else{
                System.out.println("恭喜你！猜对了");
                break;
            }
        }
        System.out.println("游戏结束！");

    }
}
