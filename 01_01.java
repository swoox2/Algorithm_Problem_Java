import java.util.*;
class Main01_01{
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main01_01 T = new Main01_01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
