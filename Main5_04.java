package study;

import java.util.Scanner;
import java.util.Stack;

public class Main5_04 {
    public int solution(String str){
        int answer=0; int lt, rt=0;
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='+'){
                rt=stack.pop();
                lt=stack.pop();
                stack.push(lt+rt);
            }else if(c=='-'){
                rt=stack.pop();
                lt=stack.pop();
                stack.push(lt-rt);
            }else if(c=='*'){
                rt=stack.pop();
                lt=stack.pop();
                stack.push(lt*rt);
            }else if(c=='/'){
                rt=stack.pop();
                lt=stack.pop();
                stack.push(lt/rt);
            }else{
                stack.push(c-48);
            }
        }
        answer=stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        Main5_04 T = new Main5_04();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
