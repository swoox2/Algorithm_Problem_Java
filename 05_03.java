import java.util.*;
class Main05_03 {
    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int k = 0; k < m; k++) {
                for (int j = 0; j < n; j++) {
                    if (moves[k] == j + 1) {
                        for (int i = 0; i < n; i++) {
                            if (board[i][j] != 0) {
                                if (!stack.isEmpty() && board[i][j] == stack.peek()) {
                                    stack.pop();
                                    answer += 2;
                                } else {
                                    stack.push(board[i][j]);
                                    board[i][j]=0;
                                    //break : else문 조건에서만 break
                                }
                                break; //if문이든 else문이든 조건 수행 후 둘다 break
                            }
                            //break : for문이 돌기만 하면 break
                        }
                    }
            }
        }
        System.out.println(stack);
        return answer;
    }
    public static void main(String[] args) {
        Main05_03 T = new Main05_03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,board,m,moves));
    }
}
