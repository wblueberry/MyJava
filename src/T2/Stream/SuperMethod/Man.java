package T2.Stream.SuperMethod;
/*
定义子类
 */
public class Man extends Human{
    //子类重写父类的方法
    @Override
    public void sayHello(){
        System.out.println("hello，我是Man");
    }

    //定义一个方法，参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法，方法的参数是一个函数式接口，使用可以用lambda
        method(()->{
            //创建父类对象
            Human h = new Human();
            //调用父类的方法
            h.sayHello();
        });

        /*
        因为有子父类关系，所以存在一个super关键字，可以调用父类的成员方法
         */

        method(()->{
            super.sayHello();
        });

        //使用super引用父类的成员方法
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
