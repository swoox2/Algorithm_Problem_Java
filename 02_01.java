import java.util.*;
class Main02_01 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02_01 T = new Main02_01();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=scan.nextInt();
        }
        for (int x : T.solution(num, arr)) {
            System.out.println(x + " ");
        }
    }
}
