package study;

import java.util.Scanner;

public class Main6_04 {
    public void solution(int[] cache, int[] arr){
        for(int x : arr){
            int index=-1;
            for(int i=0; i<cache.length; i++) if(x==cache[i]) index=i;
            if(index==-1){
                for(int i=cache.length-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            else{
                for(int i=index; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
    }

    public static void main(String[] args) {
        Main6_04 T = new Main6_04();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] cache = new int[s];
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        T.solution(cache, arr);
        for(int i=0; i<s; i++) System.out.print(cache[i]+" ");
    }
}
