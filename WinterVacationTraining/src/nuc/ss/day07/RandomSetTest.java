package nuc.ss.day07;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName RandomSetTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 8:54
 **/
public class RandomSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        /*for(int i = 0; i < 10; i++){
            boolean b = set.add(random.nextInt(20)+1);
            if(b == false){
                i++;
            }
        }*/
        while(set.size() < 10){
            set.add(random.nextInt(20)+1);
        }
        System.out.println(set);
    }

}
