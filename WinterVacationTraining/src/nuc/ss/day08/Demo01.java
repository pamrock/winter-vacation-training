package nuc.ss.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @ClassName Demo01
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/31 11:28
 **/
public class Demo01 {

    public static void main(String[] args) {
        InputStream inputStream = Demo01.class.getClassLoader().getResourceAsStream("text01.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String text = null;
        try {
            text = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
