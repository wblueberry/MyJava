package Polymorphism.demo02;
/*
向上转型一定是安全的，没有问题并且是正确的，但是也有一个弊端。
对象一旦向上转型为父类，就无法调用子类原有的特有内容。
解决方案：用对象的向下转型【还原】
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型就是：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();


        //向下转型，进行还原动作
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //下面是错误向下转型
        //本来new的识货是一只猫，现在要转型成为狗
        //Dog dog = (Dog)animal;
    }
}
