import java.util.*;
class Main05_02 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>(); int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push(str.charAt(i));
            if(stack.isEmpty()) answer += str.charAt(i);
            if (str.charAt(i) == ')') stack.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        Main05_02 T = new Main05_02();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
