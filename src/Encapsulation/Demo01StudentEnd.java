package Encapsulation;

public class Demo01StudentEnd {
    public static void main(String[] args) {
        StudentEnd stu1 = new StudentEnd();
        stu1.setName("迪丽热巴");
        stu1.setAge(22);
        System.out.println("姓名："+stu1.getName()+",年龄："+stu1.getAge());
        System.out.println("==================");

        StudentEnd stu2 = new StudentEnd("赵丽颖",24);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());
        //改变数据
        stu2.setAge(25);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());
    }
}
