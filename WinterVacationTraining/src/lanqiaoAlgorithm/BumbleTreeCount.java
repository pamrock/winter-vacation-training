package lanqiao;

import java.util.Scanner;

/**
 * @ClassName BumbleTreeCount
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 10:20
 **/
public class BumbleTreeCount {

    static int x,y;
    static boolean[][] node;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        x = sc.nextInt();
        node = new boolean[y][x];
        String[] s = new String[y];
        for(int i = 0; i < y; i++){
            s[i] = sc.next();
            char[] ch = new char[x];
            ch = s[i].toCharArray();
            for(int j = 0; j < ch.length; j++){
                if(ch[j] == 'E'){
                    node[i][j] = true;
                }else if(ch[j] == 'N'){
                    node[i][j] = false;
                }
            }
        }



    }
}
