package lanqiao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName ExcelAddress
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/29 16:56
 **/
public class ExcelAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = new LinkedList<Character>();
        int n = sc.nextInt();
        while(n > 0){
            int i = n % 26;
            String c = "";
            switch (i){
                case 0: c = "Z"; n -= 26; break;
                case 1: c = "A"; break;
                case 2: c = "B"; break;
                case 3: c = "C"; break;
                case 4: c = "D"; break;
                case 5: c = "E"; break;
                case 6: c = "F"; break;
                case 7: c = "G"; break;
                case 8: c = "H"; break;
                case 9: c = "I"; break;
                case 10: c = "J"; break;
                case 11: c = "K"; break;
                case 12: c = "L"; break;
                case 13: c = "M"; break;
                case 14: c = "N"; break;
                case 15: c = "O"; break;
                case 16: c = "P"; break;
                case 17: c = "Q"; break;
                case 18: c = "R"; break;
                case 19: c = "S"; break;
                case 20: c = "T"; break;
                case 21: c = "U"; break;
                case 22: c = "V"; break;
                case 23: c = "W"; break;
                case 24: c = "X"; break;
                case 25: c = "Y"; break;
                default: break;
            }
            list.add(0, c.charAt(0));
            n /= 26;
        }

        Character[] chars = list.toArray(new Character[0]);
        StringBuilder sb = new StringBuilder();
        for (char c: chars){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
