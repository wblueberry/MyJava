package Interface.Demo2;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefaule(){
        System.out.println("BBB");
    }
}
