import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        if (n <= 1) {
            return n;
        }
        if(map.containsKey(n)) {
            return map.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);

        map.put(n,result);

        return result;
    }
}
