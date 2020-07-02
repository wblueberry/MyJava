package Encapsulation;
/*
一个标准的类通常拥有下面四个部分：
1，所有成员变量都要使用private关键字修饰
2，为每一个成员变量编写一对儿Getter/Setter方法
3，编写一个无参数的构造方法
4，编写一个全参数的构造方法
 */
public class StudentEnd {
    private String name;
    private int age;

    public StudentEnd() {
    }

    public StudentEnd(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
