package study;

import java.util.*;
public class Main6_02 {
    public int[] solution(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main6_02 T = new Main6_02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        T.solution(arr);
        for (int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }
}
