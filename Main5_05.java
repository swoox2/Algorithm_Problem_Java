package study;

import java.util.Scanner;
import java.util.Stack;

public class Main5_05 {
    int answer=0;
    Stack<Character> stack = new Stack<>();
    public int solution(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else{
                if(str.charAt(i-1)=='('){
                    stack.pop();
                    answer+=stack.size();
                }else{
                    stack.pop();
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main5_05 T = new Main5_05();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));

    }
}
