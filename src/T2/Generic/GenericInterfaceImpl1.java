package T2.Generic;
/*
含有泛型的接口，第一种使用方法：定义接口的实现类，实现接口，指定接口泛型
public interface Iterator<E>{
E next()
}

 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s){
        System.out.println(s);
    }
}
