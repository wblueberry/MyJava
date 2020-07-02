package Object;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("================");

        one.brand = "华为";
        one.color = "白色";
        one.price = 5999.0;
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.call("小姐姐");
        one.sendMessage();



        System.out.println("================");
        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.brand = "苹果";
        two.color = "黑色";
        two.price = 9999.0;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.call("女神");
        two.sendMessage();
    }
}
