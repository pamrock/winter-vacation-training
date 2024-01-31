package nuc.ss.day06;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 9:04
 **/
public class StringTest {

    static List<Character> list = new LinkedList<>();

    public static void main(String[] args) {
        list.add('h');
        list.add('e');
        list.add('l');
        list.add('l');
        list.add('o');
        Character[] chars = list.toArray(new Character[0]);
        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            sb.append(c);
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
