package lanqiao;

/**
 * @ClassName WinTicket02
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/25 9:39
 **/
import java.util.*;

public class WinTicket02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=0,sum=0;
        int[] dis;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=(i+1);
        }
        for(int i=0;i<n;i++){
            dis=new int[n];
            int k=i,val=1,res=0;
            while(val<=n&&res<sum){
                if(dis[k%n]==1) {
                    k++;
                    continue;
                }
                if(arr[k%n]==val){
                    dis[k%n]=1;
                    res+=val;
                    val=0;
                }
                k++;
                val++;
            }
            ans=Math.max(ans,res);
        }
        System.out.println(ans);
    }

}