package Methods;

/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦

方法的重载（Overload）：多个方法的名称一样但是参数列表不一样。
 好处：只需要记住唯一的一个方法名称，就可以实现类似的多个功能。

 方法重载与下列因素有关
 1，参数个数不同
 2，参数类型不同
 3，参数的多类型顺序不同

 方法重载与下列因素无关
 1，与参数名字无关
 2，与返回值类型无关
 3，
 */
public class Demo04MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(sum(2,5,7));
        System.out.println(sum(2,5,7,9));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c,int d) {
        return a + b + c+d;
    }
}

