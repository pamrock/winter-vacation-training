package lanqiao;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName WinTicket
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/24 18:27
 **/
public class WinTicket {

    static int maxwinticket = 0;
    static int winticket = 0;
    static int n;
    static List<Integer> ticket;
    static int sign;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ticket = new LinkedList<Integer>();

        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            ticket.add(num);

        }

        for (int i = 0; i < n; i++){
            find(ticket, false);
            int j = ticket.get(0);
            ticket.remove(0);
            ticket.add(j);

            if(winticket > maxwinticket){
                maxwinticket = winticket;
            }
            winticket = 0;
        }
        System.out.println(maxwinticket);

        sc.close();
    }

    public static void find(List<Integer> list, boolean flag){


        if(!flag){
            sign = 1;
        }

        /*if(flag){
            sign += list.size();
        }System.out.println(list);*/
        flag = false;
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        int max = 0;
        Boolean flg = false;

        for(int i: list){
            if(i > max){
                max = i;
            }
            /*System.out.println(sign);*/
            if(sign == i){
                winticket++;
                sign += 200;
                list2.addAll(list1);
                flg = true;
            }
            list1.add(i);
            if(flg){
                list1.clear();
                flg = false;
            }

            sign++;

        }
        if(max < sign && sign < 200) {
            return;
        }
        list1.addAll(list2);
        if(list.equals(list1)){
            flag = true;
        }
        find(list1, flag);
    }

}
