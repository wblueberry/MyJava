package T2.Stream.Method2;
/*
通过对象名引用成员方法
使用条件：对象名已经存在，成员方法已经存在
就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodRef {
    //定义一个方法，方法的参数参观地Printable接口
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递Lambda表达式
        printString(a->{
            //创建MethodObject对象
            MethodObject obj = new MethodObject();
            //调用MethodObject对象中的成员方法printUpper，把字符串按照大写输出
            obj.printUpper(a);
        });

        System.out.println(1);
        printString(s->(new MethodObject()).printUpper(s));
        System.out.println(1);


        //使用方法引用来优化lambda，对象名已经存在，成员方法已经存在
        //所以可以使用对象名来引用成员方法
        //创建MethodObject对象
        MethodObject obj = new MethodObject();
        printString(obj::printUpper);

    }
}
