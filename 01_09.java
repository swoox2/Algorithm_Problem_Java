import java.util.*;
class Main01_09 {
    public String solution(String str) {
        String answer = "";
        str = str.replaceAll("[^0-9]", "");
        char[] c = str.toCharArray();
        if(c[0]=='0'){
            char tmp = c[0];
            for (int i = 0; i < c.length - 1; i++) {
                c[i] = c[i+1];
                answer+=c[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01_09 T = new Main01_09();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
