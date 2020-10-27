package T2.Function.Consumer;

import java.util.function.Consumer;

/*
练习：
    字符串数组当中存着多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
    要求将打印姓名的动作作为第一个Consumer接口的lambda实例
    将打印性别的动作作为第二个Consumer接口的lambda实例
    将两个Consumer接口按照顺序拼接到一起
 */
public class Demo03Test {
    //定义一个方法，参数传递一个字符串和两个Consumer接口，泛型使用String
    public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2){
        //遍历字符串数组
        for (String s : arr) {
            //使用andThen
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        //定义一个字符串类型的数组
        String[] arr = {"迪丽热巴,女","刘亦菲,女","赵丽颖,女","杨幂,女"};
        //调用
        method(arr,
                (s)->{
                    //消费方式：对s进行切割，获取姓名
                   String name =  s.split(",")[0];
                   System.out.print("姓名："+name);
        },
                (s)->{
                    //消费方式：对s进行切割，获取性别
                    String sex = s.split(",")[1];
                    System.out.println("。性别："+sex+"。");

        });
    }
}
