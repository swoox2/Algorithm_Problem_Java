import java.util.*;
class Main03_01 {
    public ArrayList<Integer> solution(int n1, int n2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1 < n1) answer.add(arr1[p1++]);
        while (p2 < n2) answer.add(arr2[p2++]);
            return answer;
    }
    public static void main(String[] args) {
        Main03_01 T = new Main03_01();
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for (int j = 0; j < n2; j++) {
            arr2[j] = scan.nextInt();
        }
        for (int x : T.solution(n1, n2, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
