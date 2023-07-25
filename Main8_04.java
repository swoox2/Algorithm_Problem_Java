package study;

import java.util.Scanner;

public class Main8_04 {
    static int n,m;
    static int[] arr;

    public void DFS(int L){
        if(L==m){
            for(int i=0; i<m; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=1; i<=n; i++){
                arr[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main8_04 T = new Main8_04();
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        m= scan.nextInt();
        arr=new int[m];
        T.DFS(0);

    }
}
