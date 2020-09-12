package T2.Set;
/*
哈希值：是一个十进制的整数，由系统随机给出，就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址
并不是数据实际存储的物理地址
在Object类中有一个方法，可以获取对象的哈希值
int hashCode()
返回该对象的哈希值

 */
public class Demo02HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);
    }
}
