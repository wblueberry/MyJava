package T2.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("王小兰");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);
        GenericInterfaceImpl2<String> gi3 = new GenericInterfaceImpl2<>();
        gi3.method("王小兰");
    }
}
