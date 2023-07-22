package study;

import java.util.*;

public class Main6_10 {
    public int count(int[] arr, int dist){
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
    public int solution(int n, int c, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid) >= c){
                answer=mid;
                lt=mid+1;
            }else rt=mid-1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main6_10 T = new Main6_10();
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int c=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        System.out.println(T.solution(n,c,arr));
    }
}
