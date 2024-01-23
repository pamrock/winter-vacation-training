package lanqiao;
/**
 * @author panyan
 * @description: 输入整数N代表N*N的方格，利用北和西两个方向上对各自行与列的统计，计算可能的路径（路径自西北至东南）--利用DFS进行求解
 */

import java.util.*;

import static lanqiao.TheMysteryOfThePath.recursion;
//这个代码自己测试很完美，但是平台上就是提交错误，所以时间复杂度和内存占用还有很大的优化空间

public class TheMysteryOfThePath {
    static int[] north;
    static int[] west;
    static int[][] e;
    static int N;
    static int x = 0, y = 0;
    static List<Integer> result;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        north = new int[N];
        west = new int[N];
        result = new LinkedList<>();
        for(int i = 0; i < N; i++){
            north[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++){
            west[i] = scan.nextInt();
        }
        e = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                e[i][j] = 0;
            }
        }
        north[0]--;
        west[0]--;
        result.add(0);
        recursion(0, 0, N, north, west);
        scan.close();

    }

    public static void recursion(int x, int y, int N, int[] north, int[] west) {

        if(x + 1 < N && e[y][x+1] == 0){

            x++;
            e[y][x] = 1;
            north[x]--;
            west[y]--;
//            System.out.println("1");
            int flag1 = 0, flag2 = 0;
            for(int i = 0; i < N; i++){
                if(north[i] != 0){ flag1 = 1;}
                if(west[i] != 0){ flag2 = 1;}
            }
            if(flag1 != 1 && flag2 != 1 && x == N - 1 && y == N - 1){
                result.add(N * N - 1);
                for(int i: result){
                    System.out.println(i + " ");
                }
                return;
            }else {
                List<Integer> t = new LinkedList<Integer>();
                t.addAll(result);
                result.add(y * N + x);
                recursion(x, y, N, north, west);
                result.clear();
                result.addAll(t);
                e[y][x] = 0;
                north[x]++;
                west[y]++;
                x--;
            }

        }

        if(y + 1 < N && e[y+1][x] == 0){

            y++;
            e[y][x] = 1;
            north[x]--;
            west[y]--;
//            System.out.println("2");
            int flag1 = 0, flag2 = 0;
            for(int i = 0; i < N; i++){
                if(north[i] != 0){ flag1 = 1;}
                if(west[i] != 0){ flag2 = 1;}
            }
            if(flag1 != 1 && flag2 != 1 && x == N - 1 && y == N - 1){
                result.add(N * N - 1);
                for(int i: result){
                    System.out.println(i + " ");
                }
                return;
            }else {
                List<Integer> t = new LinkedList<Integer>();
                t.addAll(result);
                result.add(y * N + x);
                recursion(x, y, N, north, west);
                result.clear();
                result.addAll(t);
                e[y][x] = 0;
                north[x]++;
                west[y]++;
                y--;
            }

        }

        if(x > 0 && e[y][x-1] == 0){
            x--;
            e[y][x] = 1;
            north[x]--;
            west[y]--;
//            System.out.println("3");
            int flag1 = 0, flag2 = 0;
            for(int i = 0; i < N; i++){
                if(north[i] != 0){ flag1 = 1;}
                if(west[i] != 0){ flag2 = 1;}
            }
            if(flag1 != 1 && flag2 != 1 && x == N - 1 && y == N - 1){
                result.add(N * N - 1);
                for(int i: result){
                    System.out.println(i + " ");
                }
                return;
            }else {
                List<Integer> t = new LinkedList<Integer>();
                t.addAll(result);
                result.add(y * N + x);
                recursion(x, y, N, north, west);
                result.clear();
                result.addAll(t);
                e[y][x] = 0;
                north[x]++;
                west[y]++;
                x++;
            }

        }

        if(y > 0 && e[y-1][x] == 0){
            y--;
            e[y][x] = 1;
            north[x]--;
            west[y]--;
//            System.out.println("4");
            int flag1 = 0, flag2 = 0;
            for(int i = 0; i < N; i++){
                if(north[i] != 0){ flag1 = 1;}
                if(west[i] != 0){ flag2 = 1;}
            }
            if(flag1 != 1 && flag2 != 1 && x == N - 1 && y == N - 1){
                result.add(N * N - 1);
                for(int i: result){
                    System.out.println(i + " ");
                }
                return;
            }else {
                List<Integer> t = new LinkedList<Integer>();
                t.addAll(result);
                result.add(y * N + x);
                recursion(x, y, N, north, west);
                result.clear();
                result.addAll(t);
                e[y][x] = 0;
                north[x]++;
                west[y]++;
                y++;
            }

        }

        if(N == 1){
            System.out.println(0);
        }

    }

}























