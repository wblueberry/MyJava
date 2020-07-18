package Interface.Demo2;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodDefaule(){
        System.out.println("AAA");
    }
}
