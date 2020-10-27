package T3.day01.Junit;


public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //调用
        int res = c.add(6,5);
        //打印
        System.out.println(res);
    }
}
