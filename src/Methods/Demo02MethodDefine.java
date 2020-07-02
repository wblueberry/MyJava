package Methods;
/*
方法其实就是若干个语句的功能集合
1，参数：就是进入方法中的数据
2，返回值：就是从方法中出来的数据

定义方法的完整格式：
修饰符 返回参数类型 方法名称（参数类型 参数名称，...）{
    方法体
    return 返回值；
}
修饰符：现阶段的固定写法：public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称
注：如果参数有多个，用逗号隔开
方法体：方法需要做的事情，若干行代码
return：两个作用
1，停止当前方法
2，将后面的返回值还给调用处
返回值：也就是方法执行后最终产生的数据结果
注意：return后面的返回值必须和方法名称前面的返回值类型保持对应
 */
/*
方法的三种调用方法
1，单独调用
2，打印调用:System.out.println(方法名称（参数）)
3，赋值调用
注意：此前学习的方法，返回值固定写为void，这种方法
只能够单独调用，不能进行打印调用或者赋值调用
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,30);//并不会打印出来
        System.out.println("===========================");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("===========================");


        //赋值调用
        int number = sum(15,25);
        System.out.println("变量的值："+number);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行啦！");
        int result =a+b;
        return result;
    }
}
