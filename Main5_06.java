package study;

import java.util.*;
public class Main5_06 {
    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        int p=0;
        while(q.size()!=1) {
            for (int i = 1; i <= k; i++) {
                if (i == k) q.poll();
                else {
                    p = q.poll();
                    q.add(p);
                }
            }
        }
        return answer=q.poll();
    }

    public static void main(String[] args) {
        Main5_06 T = new Main5_06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(T.solution(n,k));
    }
}
