 package Interface;

public interface MyInterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("这是静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2(){
        System.out.println("这是静态方法2");
        methodStaticCommon();
    }
    private static void methodStaticCommon(){//java 9才能这样
        System.out.println("AAA");
        System.out.println("BBB");
    }

}
