package study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5_07 {
    public String solution(String s1, String s2){
        Queue<Character> q = new LinkedList<>();
        String answer = "YES";
        for(char c1 : s2.toCharArray()){
            for(char c2 : s1.toCharArray()){
                if(c2==c1) {
                    q.add(c1);
                    break;
                }
            }
        }
        String result="";
        while(!q.isEmpty()){
            result+=q.poll();
        }

        if(!result.equals(s1)) answer="NO";
        return answer;
    }

    public static void main(String[] args) {
        Main5_07 T = new Main5_07();
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        System.out.println(T.solution(s1,s2));
    }
}
