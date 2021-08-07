import java.util.*;
class Main01_11 {
    public String solution(String s) {
        String answer = "";
        int cnt = 1; s=s+" ";
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            }else{
                answer+=s.charAt(i);
                if (cnt > 1) {
                    answer+=cnt;
                    cnt=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01_11 T = new Main01_11();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(T.solution(s));
    }
}
