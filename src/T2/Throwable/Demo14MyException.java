package T2.Throwable;

import java.util.Scanner;

public class Demo14MyException {
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
                //抛出运行期异常，无需处理，JVM会自动处理
                throw new Demo13RegisterException("亲，该用户名已经被注册。");

            }
        }
        //继续遍历比较，如果没有重复的，提示用户注册成功
        System.out.println("恭喜您，注册成功！");
    }

}
