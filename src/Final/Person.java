package Final;
/*
对于成员变量来说，如果使用final关键字修饰，那么这个变量照样不可变。
1，由于成员变量具有默认值，所有用来final之火必须手动赋值，不会再给默认值了
2,对于final的成员变量，要么使用直接复制，要么通过构造方法赋值，这两个只能选其一
3,必须保证类当中所有重载的构造方法，都最终对final的成员变量进行赋值
 */
public class Person {
//    private final String  name = "杨幂";
    private final String  name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "杨幂";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
