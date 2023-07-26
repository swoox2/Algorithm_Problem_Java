package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main8_05 {
    static int n,m;
    static int answer=Integer.MAX_VALUE;
    public void DFS(int L,int sum, Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m){
            answer=Math.min(L,answer);
        }else{
            for(int i=0; i<n; i++){
                DFS(L+1,sum+arr[i],arr);
            }
        }
    }

    public static void main(String[] args) {
        Main8_05 T = new Main8_05();
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m=scan.nextInt();
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
