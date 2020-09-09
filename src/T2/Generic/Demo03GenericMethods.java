package T2.Generic;
/*
测试含有泛型的方法
 */
public class Demo03GenericMethods {
    public static void main(String[] args) {
        //创建一个对象
        GenericMethods gm = new GenericMethods();
        /*
        调用含有泛型的方法，传递什么类型，泛型就是什么类型
         */
        gm.method01(12);
        gm.method01("王小兰");
        gm.method01(true);

        gm.method02("静态方法，不建议创建对象使用");

        //静态方法，通过类名.方法名（参数）可以直接使用
        GenericMethods.method02("静态方法");
        GenericMethods.method02(1);
    }
}
