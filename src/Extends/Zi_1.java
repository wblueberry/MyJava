package Extends;

public class Zi_1 extends Fu_1 {
    int numZi = 20;

    int num = 200;
    public void methodZi(){
        //因为本类当中有num，用的是本类的（如果本类没有，向上找父类的）
        System.out.println(num);
    }
}
