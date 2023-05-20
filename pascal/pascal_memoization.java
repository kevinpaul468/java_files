import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class pascal_memoization {
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                int pos_value = factorial(i) / (factorial(i - k) * factorial(k));
                System.out.print(pos_value + " ");
            }

            System.out.println();
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        fact = n * factorial(n - 1);
        cache.put(n, fact);
        return fact;
    }
}