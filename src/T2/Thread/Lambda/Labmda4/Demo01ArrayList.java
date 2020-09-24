package T2.Thread.Lambda.Labmda4;

import java.util.ArrayList;

/*
Lambda表达式：是可以推导，可以省略的
凡是根据上下文推导出来的内容，都可以省略不写
可以省略的内容：
    1，（参数列表）：括号中的参数列表的数据类型，可以省略不写
    2，（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
    3，{一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略（{}，return，分号）
    注意：要省略{}，return，分号，必须三者一起省略，否则会报错。
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //Jdk1.7版本之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();

        ////Jdk1.7版本之后，等号后边的泛型可以省略，可以根据等号前边的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();

    }
}
