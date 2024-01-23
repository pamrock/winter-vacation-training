package nuc.ss.day02;

import java.util.Scanner;

/**
 * @ClassName ThreeEyesDemo
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 10:06
 **/
public class ThreeEyesDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数: ");
        int number  = sc.nextInt();

        String s = number > 0 ? "你输入的是一个正数" : number == 0 ? "你输入的是0" : "你输入的是一个负数";
        System.out.println(s);
    }
}
