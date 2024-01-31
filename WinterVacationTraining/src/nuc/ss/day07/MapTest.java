package nuc.ss.day07;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 9:49
 **/
public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Honor");
        map.put(3, "OPPO");
        map.put(4, "vivo");
        map.put(5, "Xiaomi");
        System.out.println(map);
        boolean b = map.containsKey(2);
        System.out.println(b);
        b = map.containsValue("Huawei");
        System.out.println(b);
        String v = map.remove(1);
        System.out.println("删除的值为: " + v);
    }
}
