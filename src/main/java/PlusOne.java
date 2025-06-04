import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {3,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int[] biggerDigits = new int[digits.length + 1];
        boolean carry = false;
        int index = digits.length - 2;
        // get last digit
        int lastDigit = digits[digits.length - 1];
        if( lastDigit < 9) {
            digits[digits.length - 1] = lastDigit + 1;
            return digits;
        }
        if (lastDigit == 9) {
            digits[digits.length - 1] = 0;
            carry = true;
        }

        while (carry && index >= 0) {
            int currentDigit = digits[index];
            currentDigit = currentDigit + 1;

            if(currentDigit <= 9) {
                carry = false;
                digits[index] = currentDigit;
            } else {
                digits[index] = 0;
            }
            index--;
        }
        if(digits[0] == 0) {
            System.arraycopy(digits, 0, biggerDigits, 1, digits.length - 1);
            biggerDigits[0] = 1;
           return biggerDigits;
        }

        return digits;

    }
}
