import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));

    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else
               map.put(c, map.get(c) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            int count = map.get(s.charAt(i));
            if (count == 1)
                return i;
        }
        return -1;
    }
}
