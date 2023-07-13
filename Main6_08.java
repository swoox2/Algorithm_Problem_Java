package study;

import java.util.*;
public class Main6_08 {
    public int solution(int n, int m, int[] arr){
        Arrays.sort(arr);
        int answer=-1;
        int start=0, end=n-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            if(arr[mid]>m){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main6_08 T = new Main6_08();
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
