package nuc.ss.day04;

import java.util.Scanner;

/**
 * @ClassName FixeAccount
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/25 18:12
 **/
public class FixeAccount extends Account {

    @Override
    public double Interest(int year, double balance) {
        double interest = 0;
        double sumbalance = balance;
        for(int i = 0; i < year; i++){
            sumbalance += 0.03 * sumbalance;
        }
        interest = sumbalance - balance;
        return interest;
    }

    public FixeAccount(double balance) {
        super(balance);
    }

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份: ");

        year = sc.nextInt();
        Account account = new FixeAccount(1000);
        System.out.println("利息为: " + account.Interest(year, account.getBalance()));
    }

}
