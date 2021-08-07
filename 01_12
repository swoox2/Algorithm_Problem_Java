import java.util.*;
class Main01_12 {
    public String solution(int num, String str) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0,7).replaceAll("#","1").replace("*","0");
            int n1 = Integer.parseInt(tmp, 2);
            answer+=(char)n1;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01_12 T = new Main01_12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        System.out.println(T.solution(n,s));
    }
}
