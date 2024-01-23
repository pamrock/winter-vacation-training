package nuc.ss.day02;

import java.util.Scanner;

/**
 * @ClassName IfDemo
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 10:51
 **/
public class IfDemo {
    public static void main(String[] args) {
        System.out.println("请输入两个数:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();;
        int num2 = sc.nextInt();
        /*if(num1 > num2){
            System.out.println("最大的数为" + num1);
        } else{
            System.out.println("最大的数为" + num2);
        }*/
        int max = num1;
        if(num2 > num1){
            max = num2;
        }
        System.out.println("最大的数为: " + max);
    }
}
