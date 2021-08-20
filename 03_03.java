import java.util.*;
class Main03_03 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0; int sum = 0;
        for (int i = 0; i < m; i++) sum += arr[i];
        answer = sum;
        for (int i = m; i < n; i++) {
            sum += arr[i] - arr[i - m];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main03_03 T = new Main03_03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
