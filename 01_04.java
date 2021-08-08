import java.util.*;
class Main_01_04 {
    public ArrayList<String> solution(int n,String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] c = x.toCharArray();
            int lt = 0, rt = c.length-1;
            while(lt < rt){
                char tmp;
                tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++; rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_01_04 T = new Main_01_04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scan.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
