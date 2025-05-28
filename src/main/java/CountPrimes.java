import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                count++;
            }
        }

        System.out.println(Arrays.toString(isPrime));

        return count;

    }
}
