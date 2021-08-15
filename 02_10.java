import java.util.*;
class Main02_10 {
    public int solution(int n, int[][] arr) {
        int answer=0;
        int[] di = {-1, 0, 1, 0};   //시계방향
        int[] dj = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int ni = i + di[k];
                    int nj = j + dj[k];
                    if (ni >= 0 && ni < n && nj >= 0 && nj < 5 && arr[ni][nj] >= arr[i][j]) {
                        flag = false;
                        break;   // 2번째 for문으로 이동
                    }
                }
                if(flag) answer++;
                }
            }
        return answer;
    }
    public static void main(String[] args) {
        Main02_10 T = new Main02_10();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));
    }
}
