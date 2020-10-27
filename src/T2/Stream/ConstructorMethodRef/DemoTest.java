package T2.Stream.ConstructorMethodRef;
/*
类的构造器（构造方法）引用
 */
public class DemoTest {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法，参数是一个函数式接口，可以使用lambda
        printName("迪丽热巴",name->new Person(name));
        //使用方法引用，优化lambda表达式
        //构造方法new...已知，创建对象的方式已知
        //使用Person，引用new
        printName("古力娜扎",Person::new);//使用Person类的带参构造方法
    }
}
