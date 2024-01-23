package nuc.ss.day02;

import java.util.Scanner;

/**
 * @ClassName PersonalIncomeTax
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 19:06
 **/
public class PersonalIncomeTax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入薪资： ");
            int salary = sc.nextInt();
            double rate;
            if(salary > 0 && salary < 5001){
                rate = 0;
            }else if (salary > 5000 && salary <8001){
                rate = 0.03;
            }else if (salary > 8000 && salary <17001){
                rate = 0.10;
            }else if (salary > 17000 && salary <30001){
                rate = 0.20;
            }else if (salary > 30000 && salary <40001){
                rate = 0.25;
            }else if (salary > 40000 && salary <60001){
                rate = 0.30;
            }else if (salary > 60000 && salary <85001){
                rate = 0.35;
            }else {
                rate = 0.45;;
            }
            System.out.println("实际薪资为: " + salary * (1 - rate));
            System.out.println("还想继续吗？ Y/N");
            char c = sc.next().charAt(0);
            if(c == 'N'){
                break;
            }
        }

    }
}
