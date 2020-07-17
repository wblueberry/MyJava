package Extends.Demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one =  new Member("成员A",0);
        Member two =  new Member("成员B",0);
        Member three =  new Member("成员c",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=======================");
        //群主总共发20元，分三个红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        //收完红包后看余额
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
