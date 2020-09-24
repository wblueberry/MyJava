package T2.Thread.Lambda.Lambda2;

import java.util.Arrays;
import java.util.Comparator;

/*
Lambda表达式有参数有返回值练习
需求：
    使用数组存储多个Person对象
    对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        //创建数组，存储多个Person对像
        Person[] arr = {
            new Person("赵丽颖",28),
            new Person("迪丽热巴",29),
            new Person("杨幂",36),
            new Person("范冰冰",38)
        };

        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序(前边-后边）
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getAge()-p2.getAge();
//            }
//        });

        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person p1,Person p2)->{
            return p1.getAge()-p2.getAge();
        });

        //使用Lambda省略表达式，再次简化
        Arrays.sort(arr,(p1,p2)->p1.getAge()-p2.getAge());

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
