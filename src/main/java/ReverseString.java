public class ReverseString {
    public static void main(String[] args) {
        //Write a function that reverses a string. The input string is given as an array of characters s.
        //You must do this by modifying the input array in-place with O(1) extra memory.

        //Input: s = ["h","e","l","l","o"]
        //Output: ["o","l","l","e","h"]

        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i += 1;
            j -= 1;
        }
        System.out.println(s);
    }
}
