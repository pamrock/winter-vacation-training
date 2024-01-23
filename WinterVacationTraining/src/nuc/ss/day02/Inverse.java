package nuc.ss.day02;

import java.util.Scanner;

/**
 * @ClassName Inverse
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 10:15
 **/
public class Inverse {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = i / 100;
        int i2 = i / 10 - i1 * 10;
        int i3 = i % 10;
        i = i3 * 100 + i2 * 10 + i1;
        System.out.println(i);
    }
}
