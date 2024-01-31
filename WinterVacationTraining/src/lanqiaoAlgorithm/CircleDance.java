package lanqiao;

import java.util.*;

/**
 * @ClassName CircleDance
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/28 10:44
 **/
public class CircleDance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }
        List<Integer> animals = new LinkedList<Integer>();
        for (int i = 0; i <10; i++){
            animals.add(i + 1);
        }
        int m = sc.nextInt();
        int[] k = new int[m];
        int[] p = new int[m];
        int[] q = new int[m];
        for(int i = 0; i < m; i++){
            k[i] = sc.nextInt();
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        Set<List<Integer>> Lists = new HashSet<List<Integer>>();
        Lists.add(animals);
        for(int i = 0; i < m; i++){
            if(k[i] == 1){
                List<Integer>  list1= new LinkedList<Integer>();
                List<Integer>  list2= new LinkedList<Integer>();
                for(List<Integer> list: Lists){
                    if(list.contains(p[i])) list1 = list;
                    if(list.contains(q[i])) list2 = list;
                    }
                //如果在同一个圈内，则分开为两个圈
                if(list1 == list2){
                    List<Integer> newlist= new LinkedList<Integer>();
                    for(int j = list1.indexOf(p[i]); j < list1.indexOf(q[i])+3; j++){
//                        System.out.println(p[i]+1);
                        newlist.add(list1.get(list1.indexOf(p[i])+1));
                        list1.remove(list1.indexOf(p[i])+1);
                    }
                    Lists.add(newlist);
                    System.out.println(energy(Lists, n, h, f));
                }
                //如果不在同一个圈内，将两个链表合并
                if(list1 != list2){
                    while (list2.get(0) != q[i]){
                        list2.add(list2.remove(0));
                    }
                    list1.addAll(list1.indexOf(p[i])+1, list2);
                    list2.clear();
                    //System.out.println(Lists);

                    System.out.println(energy(Lists, n, h, f));
                }
            }
            if(k[i] == 2){
                h[p[i]] = q[i];
                System.out.println(energy(Lists, n, h, f));
            }
            if(k[i] == 3){
                f[p[i]] = q[i];
                System.out.println(energy(Lists, n, h, f));
            }
        }

        sc.close();
    }

    public static int energy(Set<List<Integer>> Lists, int n, int[] h, int[] f){
        int sumhappy = 0;
        for(int i = 0; i < n; i++){
            for(List<Integer> list: Lists){
                if(list.contains(i+1)){
                    int x = list.size() - 1;
                    int happy = (x * x + x)/2 * h[i] * f[i];
                    //System.out.println("****" + list.size() + " " + h[i] + " " + f[i]);
                    //System.out.println("****" + list);
                    sumhappy += happy;
                }
            }
        }
        return sumhappy;
    }

}
