package Interface;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {

        System.out.println("实现了抽象方法 BBB");
    }

    //覆盖重写默认方法：
    @Override
    public void methodDefault(){
        System.out.println("实现类B覆盖重写了接口的默认方法。");
    }

}
