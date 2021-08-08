import java.util.*;
class Main01_08 {
    public String solution(String str) {
        String answer = "Yes";
        str = str.toUpperCase();
        str = str.replaceAll("[^A-Z]", "");
        char[] c = str.toCharArray();
        int lt=0,rt=str.length()-1;
        for (int i = 0; i < str.length()/2; i++) {
            if (c[lt] == c[rt]) {
                lt++; rt--;
            }else{
                answer = "No";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01_08 T = new Main01_08();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
