package Encapsulation;
/*
构造方法就是专门用来创建对象的方法，
当我们通过关键字new来创建对象时，其实
就是在调用构造方法

格式：
public 类名称（参数类型 参数名称）{
    方法体
}

注意事项：
1，构造方法的名称必须和所在的类名称完全一致，就连大小写都要一样
2，构造方法不需要写返回值类型，连void都不写
3,构造方法不能return一个具体的返回值。
4，如果没有编写任何构造方法，那么编译器将会默认赠送一个
构造方法，没有参数，方法体。什么事情都不做
5，一旦编写了至少一个构造方法，那么编译器将不再赠送。
6,构造方法也可以重载（方法名称相同，参数不同）
 */
public class StudentCreat {
    //成员变量
    private String name;
    private int age;

    //无参数的构造方法
    public StudentCreat(){
        System.out.println("无参数构造方法执行啦!");
    }
    //有参数的构造方法
    public StudentCreat(String name,int age){
        System.out.println("有参数构造方法执行啦!");
        this.age = age;
        this.name = name;
    }
    //Getter或者Getter
    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
