import java.util.*;
class Main02_07 {
    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt=0;
            }
            answer+=cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main02_07 T = new Main02_07();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
