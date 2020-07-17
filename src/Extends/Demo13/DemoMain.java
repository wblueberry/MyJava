package Extends.Demo13;

public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();//错误写法
        //Dog dog = new Dog();//错误写法
        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
        System.out.println("=====================");

        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();
        dogGolden.sleep();
    }
}
