package study;

import java.util.Arrays;
import java.util.Scanner;

public class Main6_05 {
    public String solution(int n, int[] arr){
        String answer="U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]) return "D";
        }
        return answer;
    }
    public static void main(String[] args) {
        Main6_05 T = new Main6_05();
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }
}
