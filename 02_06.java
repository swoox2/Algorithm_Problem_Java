import java.util.*;
class Main02_06 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        Main02_06 T = new Main02_06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x);
        }
    }

}
