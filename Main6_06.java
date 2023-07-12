package study;

import java.util.Arrays;
import java.util.Scanner;

public class Main6_06 {
    static int[] answer = new int[2];
    public void solution(int n, int[] arr){
        int[] tmp = new int[n+1];
        for(int i=1; i<=n; i++) tmp[i]=arr[i];
        Arrays.sort(tmp);
        int cnt=0;
        for(int j=1; j<=n; j++){
            if(tmp[j]!=arr[j]) answer[cnt++]=j;
        }
    }
    public static void main(String[] args) {
        Main6_06 T = new Main6_06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) arr[i]= scan.nextInt();
        T.solution(n,arr);
        System.out.println(answer[0]+" " +answer[1]);
    }
}
