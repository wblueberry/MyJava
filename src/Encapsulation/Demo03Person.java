package Encapsulation;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

//        person.age = 18;//不能直接访问
        person.setAge(20);//间接访问
        person.name = "鞠婧祎";
        person.show();

    }
}
