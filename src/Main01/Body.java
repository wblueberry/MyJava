package Main01;

public class Body {//外部类

    //成员内部类
    public class Heart{
        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动...");
            System.out.println("我叫"+name);//正确访问外部类的成员变量
        }
    }

    //外部类的成员变量
    private String name;

    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();//创建内部类对象
        heart.beat();//调用内部类的方法
        //匿名对象：
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
