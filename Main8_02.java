package study;
import java.util.*;
public class Main8_02 {
    static int total_weigh;
    static int n, answer=0;
    public void DFS(int index, int sum, int[] arr){
        if(total_weigh<sum) return;
        if(index==n){
            if(answer<sum) answer=sum;
        }else{
                DFS(index+1,sum+arr[index],arr);
                DFS(index+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main8_02 T = new Main8_02();
        Scanner sc = new Scanner(System.in);
        total_weigh=sc.nextInt();
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);

    }

}
