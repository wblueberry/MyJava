package ArrayList;

import java.util.ArrayList;

public class Demo03ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("范冰冰");
        list.add("杨幂");
        
        //遍历集合
        //for循环快捷语法：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
