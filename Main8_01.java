package study;
import java.sql.SQLOutput;
import java.util.*;
public class Main8_01 {
    static String answer="NO";
    static int n, total=0;
    boolean flag=false;
    public void DFS(int L, int sum, int[] arr){
        if(L==arr.length){
            if((total-sum)==sum) answer="YES";
            return;
        }else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main8_01 T =new Main8_01();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            total+=arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
