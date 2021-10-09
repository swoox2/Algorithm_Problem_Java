import java.util.*;
class Main05_04 {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') stack.push(lt + rt);
                if(x=='-') stack.push(lt - rt);
                if(x=='*') stack.push(lt * rt);
                if(x=='/') stack.push(lt / rt);
            }
        }
        answer = stack.peek();
        return answer;
    }
    public static void main(String[] args) {
        Main05_04 T = new Main05_04();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
