package nuc.ss.day02;

import java.util.Scanner;

/**
 * @ClassName FreeFall
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 9:39
 **/
public class FreeFall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入下落时间: ");
        int t = sc.nextInt();
        double h = 0.5 * 9.8 * t * t;
        System.out.println("下落距离为: " + h);
    }
}
