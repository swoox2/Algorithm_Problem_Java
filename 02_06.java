import java.util.*;
class Main02_06 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int reverse = 0;
            while (!(tmp==0)) {
                int t = tmp % 10;
                tmp = tmp / 10;
                reverse = reverse * 10 + t;
            }
            if(isPrime(reverse)) answer.add(reverse);
        }
        return answer;
    }
    public boolean isPrime(int num) {  //소수인지 확인
        if(num==1) return false;
        for (int i = 2; i < num; i++) {
            if(num%i==0) return false;
        }
        return true;
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
            System.out.print(x+" ");
        }
    }
}
