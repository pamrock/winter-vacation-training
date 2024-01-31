package nuc.ss.day03;

import java.util.Random;

/**
 * @ClassName DoubleColorBall
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 8:47
 **/
public class DoubleColorBall {
    public static void main(String[] args) {

        int[] arr = new int[7];
        Random random = new Random();

        //先摇6红球
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(33) + 1;
            for(int j = 0; j < i - 1; j++){
                if(arr[j] == arr[i]){
                    i--;
                    break;
                }
            }
        }

        //再摇1蓝球
        arr[arr.length-1] = random.nextInt(17) + 1;

        System.out.println("本期中奖结果: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
