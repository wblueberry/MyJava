package T2.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
java.util.linkedHashMap<K,V> extends HashMap<K,V>
Map 接口的哈希表和连接列表实现，具有可预知的迭代顺序。
底层原理：
    哈希表+链表（记录元素的顺序）
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("d","b");
        map.put("c","d");
        map.put("b","d");
        System.out.println(map);//key不允许重复，无序的集合

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","b");
        linked.put("b","b");
        linked.put("c","c");
        linked.put("d","v");
        System.out.println(linked);//key不允许重复，有序的集合
    }
}
