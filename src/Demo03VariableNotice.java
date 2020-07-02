/*
使用变量的时候，有一些注意事项
1，如果创建多个变量，那么变量之间的名字不能重复
2，对于float和long类型来说，字母后缀F和L不能省略
3，如果使用byte或者short类型变量，数据值范围不能超过数据类型的范围
4，变量一定要先赋值才能直接使用
5，变量的使用不能超过作用域范围。
作用域：从定义变量的一行开始，一直到直接所属的大括号结束为止。
6，可以通过一个语句创建多个变量，但是不推荐使用
 */


public class Demo03VariableNotice {
    public static  void main(String[] args){
        System.out.println("123");
    }
}
