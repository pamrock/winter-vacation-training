package nuc.ss.day03;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 10:49
 **/
public class Phone {

    String brand;
    double price;

    public void show(){
        System.out.println("品牌: " + brand + ",价格: " + price);
    }

    public static void main(String[] args) {

        Phone p = new Phone();
        p.show();
        p.brand = "Nokia";
        p.price = 598.5;
        p.show();
    }

}
