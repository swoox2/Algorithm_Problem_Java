package study;
import java.util.*;

class Person{
    int id, priority;
    public Person(int id, int priority){
        this.id=id;
        this.priority=priority;
    }
}
public class Main5_08 {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Queue<Person> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.add(new Person(i,arr[i]));
        }

        while(!q.isEmpty()){
            Person out = q.poll();
            for(Person p : q){
                if(out.priority < p.priority){
                    q.add(out);
                    out=null;
                    break;
                }
            }
            if(out!=null){
                answer++;
                if(out.id==m) return answer;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Main5_08 T = new Main5_08();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
