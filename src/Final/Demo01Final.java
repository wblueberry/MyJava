package Final;
/*
final关键字代表最终、不看改变的。

常见四种用法：
1，可以用来修饰一个类
2，可以用来修饰一个方法
3，可以用来修饰一个局部变量
4，可以用来修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num = 10;
        num = 20;
        System.out.println(num);//20

        final int num1 = 200;//final修饰局部变量，这个变量不能被修改了。
        System.out.println(num1);

        //正确写法：
        final int num2;
        num2 = 30;

        //对于基本类型来说，不可变说的是变量当中的数值不可变。
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变。
        Student student = new Student("赵丽颖");
        System.out.println(student.getName());
        System.out.println(student);//赵丽颖的地址
        student = new Student("杨幂");//地址发生改变
        System.out.println(student.getName());//杨幂
        System.out.println(student);//杨幂的地址
        System.out.println("=============================");

        final  Student student1 = new Student("刘亦菲");//final修饰的。
        // 地址不可改变,但是地址里面的内容可以改变。
        System.out.println(student1);
        System.out.println(student1.getName());
        student1.setName("迪丽热巴");
        System.out.println(student1.getName());//内容变了
        System.out.println(student1);//地址没变
    }
}
