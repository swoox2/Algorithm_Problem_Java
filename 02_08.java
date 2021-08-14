import java.util.*;
class Main02_08 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] > arr[j]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main02_08 T = new Main02_08();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}
