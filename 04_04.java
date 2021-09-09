import java.util.*;
class Main04_04 {
    public int solution(String s1, String s2) {
        int answer = 0;
        HashMap<Character, Integer> sm1 = new HashMap<>();
        HashMap<Character, Integer> sm2 = new HashMap<>();
        for (char key : s2.toCharArray()) {
            sm2.put(key, sm2.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < s2.length() - 1; i++) {
            sm1.put(s1.charAt(i), sm1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int lt=0;
        for (int rt = s2.length() - 1; rt < s1.length(); rt++) {
            sm1.put(s1.charAt(rt), sm1.getOrDefault(s1.charAt(rt), 0) + 1);
            if(sm1.equals(sm2)) answer++;
            sm1.put(s1.charAt(lt), sm1.get(s1.charAt(lt)) - 1);
            if(sm1.get(s1.charAt(lt))==0) sm1.remove(s1.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main04_04 T = new Main04_04();
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        System.out.println(T.solution(s1, s2));
    }
}
