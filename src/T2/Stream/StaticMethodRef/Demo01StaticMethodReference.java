package T2.Stream.StaticMethodRef;
/*
通过类名引用静态成员方法
条件：类已经存在，静态成员方法也存在
就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    //定义一个方法，方法的参数传递要计算绝对值的整数和函数式接口Calcable
    public static int method(int num,Calcable c){
        return c.calsAbs(num);
    }

    public static void main(String[] args) {
        //调用method方法，传递要计算绝对值的整数和lambda表达式
        int number = method(-10, s -> Math.abs(s));//对参数进行绝对值计算并返回结果
        System.out.println(number);


        //使用方法引用优化lambda，条件：类已经存在，静态成员方法也存在
        System.out.println(method(-20,Math::abs));
    }
}
