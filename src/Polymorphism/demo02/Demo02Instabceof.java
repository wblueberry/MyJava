package Polymorphism.demo02;
/*
如何才能知道一个父类引用的对象，本来是什么子类？

格式：
对象 instanceof 类型
这将得到一个布尔值结果，也就是判断前面的对象能不能当做后面类型的实例

 */
public class Demo02Instabceof {
    public static void main(String[] args) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();//猫吃鱼

        //如果期望调用子类特有方法，需要向下转型：
        //判断一下父类引用的animal是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        //判断一下animal是不是cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }



    }
}
