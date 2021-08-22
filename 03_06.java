import java.util.*;
class Main03_06 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0,lt=0,cnt=0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main03_06 T = new Main03_06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
