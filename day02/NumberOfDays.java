package nuc.ss.day02;

import java.util.Scanner;

/**
 * @ClassName NumberOfDays
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 15:56
 **/
public class NumberOfDays {
    public static void main(String[] args) {
        System.out.println("请输入月份: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 5:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31 + "天");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30 + "天");
            default:
                System.out.println(28 + "天");
        }
    }
}
