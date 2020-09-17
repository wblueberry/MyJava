package T2.Map;

import java.util.HashMap;
import java.util.Map;

/*
java.util.Map<k,v>集合
Map集合的特点：
    1，Map集合是一个双列集合，一个元素包含两个值，一个key和一个value
    2，Map集合中的元素，key和value的数据类型可以详谈，也可以不同
    3，Map集合中的元素，key是不允许重复的，value是可以重复的
    4，Map集合中的元素，key和value是一一对应的

java.util.HashMap<k,v> 集合 implements Map<k,v>接口
HashMap集合的特点：
    1，HashMap集合底层是哈希表：查询的速度特别快
        jdk1.8之前：数组+单项链表
        jdk1.8之后：数组+单项链表/红黑树（链表的长度超过8）：提高查询速度
    2，hashMap集合是一个无序的集合，存储元素和取出元素是顺序可能不一样
java.util.linkedHashMap<k,v> 集合 implements HashMap<k,v>集合
linkedHashMap的特点：
    1，linkedHashMap集合底层是哈希表+链表（保证迭代顺序）
    2，linkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一样的

 */
public class Demo01Map {
    public static void main(String[] args) {
        show2();
    }
    /*
    public V put(k key,V value):把指定的键与指定的值添加到Map集合中
    返回值：V
        存储键值对的时候，key不重复，返回值V是null
        存储键值对的时候，会使用新的value替换map中重复的value，返回被替换的value值
     */
    private static void show1(){
        //创建Map集合对象，使用多态的语法
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨","范冰冰");
        System.out.println(v1);
        String v2 = map.put("李晨","范冰冰2");
        System.out.println(v2);
        System.out.println(map);
        map.put("hello","world");
        System.out.println(map);
    }
    /*
    public V remove(Object key):把指定的键所对应的元素，在Map中删除，返回被删除的元素的值
    返回值：V
        1，key存在，v返回被删除的值
        2，key不存在，v返回null
     */
    private static void show2(){
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",28);
        map.put("迪丽热巴",29);
        map.put("杨幂",30);
        System.out.println(map);

        Integer v1 = map.remove("迪丽热巴");
        System.out.println(v1);
        System.out.println(map);
        /*
    public V get(Object key)根据指定的键，在Map集合中获取对应的值。
    返回值：
        key存在，返回对应的value值
        key不存在，返回null
     */
        Integer v4 = map.get("杨幂");
        System.out.println(v4);

        /*
    boolean containsKey(Object key) 判断集合中是否包含指定的键
    包含返回true，不包含返回false
     */
        boolean b = map.containsKey("赵丽颖");
        System.out.println(b);
    }


}
