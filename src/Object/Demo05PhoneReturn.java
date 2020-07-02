package Object;

public class Demo05PhoneReturn {
    public static void main(String[] args) {

        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "玫瑰金";
        one.price = 9999.0;
        return one;
    }
}
