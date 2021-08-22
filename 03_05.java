import java.util.*;
class Main03_05 {
    public int solution(int n) {
    /** s1
      int answer = 0, cnt = 1;
        n--; // 두개이상의 연속된 자연수
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    } **/
        int answer = 0, lt=1, sum=0;
        for (int rt = 1; rt <= n / 2 + 1; rt++) {
            sum+=rt;
            if(sum==n) answer++;
            while (sum > n) {
                sum-=lt;
                lt++;
                if(sum==n) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main03_05 T = new Main03_05();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
