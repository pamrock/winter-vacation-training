package nuc.ss.day02;

/**
 * @ClassName Multiplication
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/23 17:27
 **/
public class Multiplication {

    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < i + 1; j++){
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
