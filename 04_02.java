import java.util.*;
class Main04_02 {
    public String solution(String s1, String s2) {
        String answer = "Yes";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char key : s1.toCharArray()) {
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }
        for (char key : s2.toCharArray()) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }
        for (char key1 : s1.toCharArray()) {
            for (char key2 : s2.toCharArray()) {
                if (key1 == key2) {
                    if (map1.get(key1) != map2.get(key2)) answer = "No";
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main04_02 T = new Main04_02();
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        System.out.println(T.solution(s1, s2));
    }
}
