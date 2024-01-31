package nuc.ss.day03;

/**
 * @ClassName Point
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 10:12
 **/
public class Point {
    int x;
    int y;

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);

        point.x = 3;
        point.y = 4;
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
    }
}
