package study;

import java.util.*;

public class Main8_09 {
    static int n,m;
    static int[] arr2;
    public void DFS(int L, int s){
        if(L==m){
            for(int i=0; i<m; i++) System.out.print(arr2[i]+" ");
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                arr2[L]=i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main8_09 T=new Main8_09();
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        arr2=new int[m];
        T.DFS(0,1);
    }
}
