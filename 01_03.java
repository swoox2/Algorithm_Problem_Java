import java.util.*;

class Main01_03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE,pos;
        while ((pos=str.indexOf(" ")) != -1) {
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if (len > m) {
                answer=tmp;
            }
            str = str.substring(pos+1);
            if(str.length() > m) answer=str;
        }
        return answer;
    }

    public static void main(String[] args){
        Main01_03 T = new Main01_03();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
