package T2.Stream.MethodReference;
//::（双冒号）为引用运算符，而它所在的表达式被称为方法引用
//注意：Lambda中传递的参数一定是方法引用中的那个方法可以接收的类型，否则会抛出异常
public class Demo01Printable {
    //定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Printable p){
        p.print("HelloWorld!");
    }

    public static void main(String[] args) {
        //调用printString方法,参数是一个函数式接口，所以可以传递Lambda
        printString(s->System.out.println(s));

        /*
        分析：
            Lambda表达式的目的，打印参数传递的字符串
            把参数s传递给System.out对象，调用out对象中的方法println对字符串进行了输出
            注意：
            1，System.out对象是已经存在的
            2，println方法也是已经存在的
           所以可以使用方法引用来优化Lambda表达式
           可以使用System.out方法直接引用（调用）println方法
         */
        printString(System.out::println);
    }
}
