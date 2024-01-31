package nuc.ss.day07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName IteratorMapTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 10:54
 **/
public class IteratorMapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Honor");
        map.put(3, "OPPO");
        map.put(4, "vivo");
        map.put(5, "Xiaomi");
        //直接遍历
        System.out.println(map);
        System.out.println("-----------------------------------");
        //使用keyset方法遍历Map
        Set<Integer> set = map.keySet();
        for(Integer it: set){
            System.out.println(it + "=" + map.get(it));
        }
        System.out.println("-----------------------------------");
        //使用entrySet遍历Map
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> e: entries){
            System.out.println(e);
        }
    }

}
