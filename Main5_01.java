package study;

import java.util.*;
class Main5_01 {
    public String solution(String str) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if(stack.isEmpty()) return answer;
                stack.pop();
            }
        }
        if(stack.isEmpty()) answer = "YES";
        return answer;
    }
    public static void main(String[] args) {
        Main5_01 T = new Main5_01();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
