package Polymorphism.Demo03;

public class Demo01main {
    public static void main(String[] args) {
        //创建一个电脑
        Computer computer = new Computer();
        computer.powerOn();


        //准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        //首先向上转型
        USB usbMouse = new Mouse();//多态
        //参数是USB类型，正好传进去的就是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态
        //方法参数是USB类型，传递进去的实现类对象
        computer.useDevice(keyboard);//正确写法，发生了向上转型
        computer.useDevice(new Keyboard());//也是正确写法，自动转型（小到大）例如int --> double

        computer.powerOff();

    }

}
