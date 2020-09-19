package T2.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

/*
HashMap存储自定义类型键值
Map集合保证key元素是唯一的
    作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show2();
    }
    /*
        HashMap存储自定义的键与值
            key:Person类型，必须重写hashCode方法和equals方法
            value：String类型，可以重复
     */
    private static void show2(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",18),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        //遍历
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }

    }
    /*
    HashMap存储自定义的键与值
    key:String类型
        String类重写了hashCode方法和equals方法，可以保证key唯一
    value:Person类型
        value可以重复（同名同年龄的人视为一个人）
     */
    private static void show1(){
        //创建hashMap集合
        HashMap<String,Person> map = new HashMap<>();
        //添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));

        //使用keySet和增强for循环遍历集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}
