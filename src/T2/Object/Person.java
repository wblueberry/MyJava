package T2.Object;

public class Person {
    private String name;
    private int age;

    public Person() {
    }
    /*重写toString*/
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*重写Equals方法，Object的equals方法默认比较两个对象的地址值，没有意义
    所以要对其进行重写，使其比较两个对象的属性（name和age）
    问题：隐含一个多态，多态的弊端：无法使用子类特有的内容（属性和方法）
    解决：可以使用向下转型（强转）把obj类型转换为Person类
    */
    @Override
    public boolean equals(Object obj){
        //增加一个判断，传递的参数obj不能是this本身
        if(obj == this){
            return true;
        }
        //增加一个判断，传递的参数不能是null
        if(obj == null){
            return false;
        }
        //增加一个判断，防止出现类型转换异常
        if(obj instanceof Person){
            //使用向下转型，把obj转换为Person类型
            Person p = (Person)obj;
            //比较两个对象的属性
            boolean b = this.name.equals(p.name) && this.age==p.age;
            return b;
        }
        //不是person类型直接返回false
        return false;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
