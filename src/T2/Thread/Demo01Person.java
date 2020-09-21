package T2.Thread;

public class Demo01Person {
    private String name;

    public void run(){
        //定义一个循环，执行20次
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"-->"+i);
        }
    }

    public Demo01Person(String name) {
        this.name = name;
    }

    public Demo01Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
