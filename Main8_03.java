package study;

import java.util.Scanner;
public class Main8_03 {
    static int answer=0,n,m;
    public void DFS(int L, int sum, int time, int[] a, int[] b){
        if(time>m) return;
        if(L==n){
            answer=Math.max(answer, sum);
        }else{
            DFS(L+1,sum+a[L],time+b[L],a,b);
            DFS(L+1,sum,time,a,b);
        }
    }
    public static void main(String[] args) {
        Main8_03 T = new Main8_03();
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt(); // 문제의 개수
        m= scan.nextInt(); // 제한시간
        int[] a=new int[n]; //문제 점수
        int[] b=new int[n]; //문제 풀이 시간
        for(int i=0; i<n; i++){
            a[i]=scan.nextInt();
            b[i]=scan.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);

    }
}
