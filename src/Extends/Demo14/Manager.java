package Extends.Demo14;

import java.util.ArrayList;
//群主的类
public class Manager extends User{
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //需要一个集合存储若干个红包的余额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();

        if(totalMoney > leftMoney){
            System.out.println("余额不足！");
            return redList;//返回空集合
        }
        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney-totalMoney);
        //发红包,平均拆分为count份
        int avg = totalMoney / count;
        //余数
        int mod = totalMoney % count;//余数，也就是甩下的零头

        //除不开的零头，包在最后一个红包当中
        //下面把红包一个个地放在集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg + mod ;
        redList.add(last);
        return redList;
    }
}
