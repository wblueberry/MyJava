package T2.Object;
/*
boolean equals(Object obj)指示其他某个对象是否与此对象相等
基本数据类型：比较的是值
引用数据类型：比较的是地址值
 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("杨幂",25);
        System.out.println(one);
        System.out.println(two);
        boolean b = one.equals(two);
        System.out.println(b);
    }
}
