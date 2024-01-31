package lanqiao;

import java.util.Scanner;

/**
 * @ClassName TheMysteryOfThePath02
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 9:06
 **/
public class TheMysteryOfThePath02 {
    static int[] path;
    static int n;
    static int[] north;
    static int[] west;
    static boolean[][] visited;
    private static boolean success;
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        north = new int[n];
        west = new int[n];
        path = new int[n * n];
        visited = new boolean[n][n];
        sc.nextLine();
        for (int i = 0; i < n; i++){
            north[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            west[i] = sc.nextInt();
        }
        dfs(0, 0, 0);
    }

    private static void dfs(int x, int y, int step) {
        path[step] = y * n + x;
        visited[x][y] = true;
        north[x]--;
        west[y]--;
        if (x == n - 1 && y == n - 1 && check()) {
            success = true;
            for(int i = 0; i < step + 1; i++){
                System.out.print(path[i] + " ");
            }
            return;
        }
        for(int i = 0; i < 4; i++){
            int xnext = x + dx[i], ynext = y + dy[i];
            if(!success && 0 <= xnext && xnext <= n-1 && 0 <= ynext && ynext <= n-1 && !visited[xnext][ynext] && north[xnext] > 0 && west[ynext] > 0){
                dfs(xnext, ynext, step + 1);
                visited[xnext][ynext] = false;
                north[xnext]++;
                west[ynext]++;
            }
        }
    }

    private static boolean check() {
        for(int i = 0; i < n; ++i){
            if(north[i] != 0 || west[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
