package lanqiao;

import java.util.Scanner;

/**
 * @ClassName KTimes
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 10:49
 **/
public class KTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int flag = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = 0;
            for (int j = i; j < n; j++){
                sum += a[j];
                if(sum%k == 0){
                    flag++;
                }
            }

        }
        System.out.println(flag);
        sc.close();
    }
}
