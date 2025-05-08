import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

    public static int romanToInt(String s) {
        Map sym = new HashMap<Character, Integer>();
        sym.put('I', 1);
        sym.put('V', 5);
        sym.put('X', 10);
        sym.put('L', 50);
        sym.put('C', 100);
        sym.put('D', 500);
        sym.put('M', 1000);

        int sum = 0;
        int prev = 0;
        for (int i = s.length() -1 ; i >= 0; i--) {
           int curr = (int) sym.get(s.charAt(i));
           if (curr < prev) {
               sum -= curr;
           }
           else {
               sum += curr;
           }
           prev = curr;
        }
        return sum;
    }
}
