import java.util.*;
class Main01_05 {
    public String solution(String str){
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }
            else{
                char tmp;
                tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++; rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }


    public static void main(String[] args){
        Main01_05 T = new Main01_05();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
