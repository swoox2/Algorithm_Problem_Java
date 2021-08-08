import java.util.*;
class Main01_02 {
    public String solution(String str){
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) answer += (char)(c += 32);
            else answer += (char) (c -= 32);
        }
        return answer;
    }

    public static void main(String[] args){
        Main01_02 T = new Main01_02();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
