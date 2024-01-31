package nuc.ss.day07;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 8:43
 **/
public class SetTest {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<String>();
        strings.add("one");
        System.out.println(strings);
        strings.add("two");
        System.out.println(strings);
        strings.add("three");
        System.out.println(strings);

    }
}
