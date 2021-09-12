import java.util.*;
class Main04_05 {
    public int solution(int n, int k,int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순
        for (int i = 0; i <= n - k; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt=1;
        for (int x : Tset) {
            if(cnt==k) answer=x;
            cnt++;
        }
            return answer;
    }
    public static void main(String[] args) {
        Main04_05 T = new Main04_05();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
}
