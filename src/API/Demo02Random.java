package API;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(9);
        System.out.println("随机数是："+num);
    }
}
