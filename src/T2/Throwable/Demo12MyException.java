package T2.Throwable;

import java.util.Scanner;

/*
要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
分析：
    1，使用数组保存已经注册过的用户名（数据库）
    2，使用Scanner获取用户输入的注册的用户名（前端，页面）
    3，定义一个方法，对用户输入的注册的用户名进行判断
        遍历存储用户名的数组，获取每一个用户名
        使用获取到的用户名和用户输入的用户名比较
            true：
                用户名已经存在，抛出异常RegisterException，告知用户
            false：
                继续遍历比较，如果没有重复的，提示用户注册成功
 */
public class Demo12MyException {
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args){
        //2，使用Scanner获取用户输入的注册的用户名（前端，页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String username= sc.next();
        checkUsername(username);
    }
    //3，定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUsername(String username){
        //遍历存储用户名的数组，获取每一个用户名
        for (String name : usernames) {
            //使用获取到的用户名和用户输入的用户名比较
            if(name.equals(username)){
                //用户名已经存在，抛出异常RegisterException，告知用户
                try {
                    throw new Demo11RegisterException("亲，该用户名已经被注册。");
                } catch (Demo11RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法，让后面的程序不运行
                }
            }
        }
        //继续遍历比较，如果没有重复的，提示用户注册成功
        System.out.println("恭喜您，注册成功！");
    }

}
