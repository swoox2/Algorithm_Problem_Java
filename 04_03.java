import java.util.*;
class Main04_03 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int lt=0, rt=k-1;
        while(rt!=n){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            rt++;
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main04_03 T = new Main04_03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for(int x: T.solution(n,k,arr)) System.out.print(x + " ");
    }
}
