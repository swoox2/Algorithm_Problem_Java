package study;

import java.util.Scanner;
import java.util.Stack;

public class Main5_03 {
    public int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++){
            for(int j=1; j<board.length; j++){
                if(board[j][moves[i]]!=0){
                    if(!stack.isEmpty() && stack.peek()==board[j][moves[i]]){
                        stack.pop();
                        board[j][moves[i]]=0;
                        answer+=2;
                        break;
                    }
                    stack.push(board[j][moves[i]]);
                    board[j][moves[i]]=0;
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_03 T = new Main5_03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                board[i][j]= scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<moves.length; i++){
            moves[i]=scan.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
