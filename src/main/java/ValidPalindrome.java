import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            // skip right if non alphanumeric
            while(start < end && !Character.isLetterOrDigit(s.charAt(end)) ) {
                end--;
            }
            // skip left if non alphanumeric
            while(start < end && !Character.isLetterOrDigit(s.charAt(start)) ) {
               start++;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) ) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }
}
