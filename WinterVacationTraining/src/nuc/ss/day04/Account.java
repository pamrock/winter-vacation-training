package nuc.ss.day04;

/**
 * @ClassName Account
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/25 18:08
 **/
public abstract class Account {

    double balance;
    public abstract double Interest(int year, double balance);

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
