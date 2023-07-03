package study;
import java.util.*;
public class Main5_08 {
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer="NO";
        return answer;
    }

    public static void main(String[] args) {
        Main5_08 T = new Main5_08();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
