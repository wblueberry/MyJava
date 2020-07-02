package API;
/*
匿名对象：
只有右边的对象，没有左边的赋值语句和赋值符号
格式：new 类名称（）；
注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象
使用建议：如果确定有一个对象，只需要只用唯一的一次，就可以使用匿名对象。

 */
public class Demo01Anoymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "赵丽颖";
        one.showName();
        System.out.println("====================");

        //匿名对象
        new Person().name = "迪丽热巴";
        new Person().showName();

    }
}
