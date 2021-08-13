import java.util.*;
class Main02_05 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
            }
            for (int j = i; j <= n; j = j + i) {
                arr[j]=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02_05 T = new Main02_05();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
