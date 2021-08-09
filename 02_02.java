import java.util.*;
class Main02_02 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02_02 T = new Main02_02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
