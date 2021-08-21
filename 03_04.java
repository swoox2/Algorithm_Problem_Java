import java.util.*;
class Main03_04 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == m) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main03_04 T = new Main03_04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int m = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
         }
        System.out.println(T.solution(n,m,arr));
    }
}
