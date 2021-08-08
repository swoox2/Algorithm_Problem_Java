import java.util.*;
class Main02_01 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        answer[0]= arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                answer[i + 1] = arr[i + 1];
            }else{
                i++;
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
        /**System.out.println(T.solution(num,arr));**/
        for (int x : T.solution(num, arr)) {
            System.out.println(x + " ");
        }
    }
}
