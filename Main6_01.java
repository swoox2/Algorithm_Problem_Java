package study;

import java.util.*;

public class Main6_01 {
    public void solution(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main6_01 T = new Main6_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        T.solution(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
