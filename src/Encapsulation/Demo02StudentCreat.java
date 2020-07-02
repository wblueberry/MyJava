package Encapsulation;

public class Demo02StudentCreat {
    public static void main(String[] args) {
        StudentCreat stu1 = new StudentCreat();
        System.out.println("===============");
        StudentCreat stu2 = new StudentCreat("赵丽颖",20);

        System.out.println("姓名："+stu2.getName()+"  "+"年龄："+ stu2.getAge());

        //改变成员变量的数据内容
        stu2.setAge(21);//改变年龄
        System.out.println("姓名："+stu2.getName()+"  "+"年龄："+stu2.getAge());

    }
}
