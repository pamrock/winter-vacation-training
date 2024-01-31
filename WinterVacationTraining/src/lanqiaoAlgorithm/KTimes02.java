package lanqiao;

import java.util.Scanner;

/**
 * @ClassName KTimes02
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 18:45
 **/

// 1:无需package
// 2: 类名必须Main, 不可修改

public class KTimes02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        long[] v = new long[200000];
        long sum=0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
            sum+=a[i];
// 利用求余数 将相同余数的元素放到一起
            v[(int)(sum % k)]++;
        }
        sc.close();
//  余数为0的元素自成一个 k倍区间
        count=count+v[0];
        for(int i=0;i<k;i++){
// 两个相同余数的元素。他们的差一定为 k倍区间， 13%2=1 25%2=1  （25-13）%2==0
// 任意两个数都可以组合一次 相当于 c（2，x） =  x（x-1）/2
            count+=(v[i]*(v[i]-1))/2;
        }
        System.out.println(count);
    }
}
