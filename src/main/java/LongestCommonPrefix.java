import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));

    }
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                if (prefix.isEmpty()) return "";
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;

    }
}
