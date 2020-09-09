package T2.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型，默认为object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建一个GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        //创建一个GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("王小兰");
        String name1 = gc3.getName();
        System.out.println(name1);

    }
}
