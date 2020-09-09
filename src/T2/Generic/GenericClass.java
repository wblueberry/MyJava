package T2.Generic;
/*
    定义一个含有泛型的类，模拟ArrayList集合
    泛型是一个位置的数据类型，当我们不确定使用什么数据类型的时候，可以使用泛型
    泛型可以接受任意类型的数据
    创建对象的时候确定泛型的数据类型
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
