package Encapsulation;
/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。

注意：一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
但是，超出了本类方位之外就不能直接访问了


怎样间接访问呢？
就是设置一对Getter和Setter方法

必须叫setXxx或者getXxx命名规则
对于setXxx来说，不能有返回值，数据类型和成员变量对应
对于getXxx来说，不能有参数，数据类型和成员变量对应

 */
public class Person {

    String name;//名字

     private int age;//年龄

    public void show(){
        System.out.println("我叫："+name+"，年龄："+age);
    }
    //这个成员方法，专门用于向age设置数据
    public void setAge(int num){
        if(num>100&&num>=9){
            age = num;
        }else{
            System.out.println("不合理数值！");
        }

    }
    //这个成员方法，专门用于获取age的数据
    public int getAge(){
        return age;
    }
}
