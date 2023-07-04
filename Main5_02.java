package study;

import java.util.*;
public class Main5_02 {
    public String solution(String str){
        String answer="";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(stack.isEmpty() && c!='(' && c!=')') answer+=c;
            if(c=='('){
                stack.push(c);
            }else if(c==')'){
                stack.pop();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main5_02 T = new Main5_02();
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        System.out.println(T.solution(str));
    }
}
