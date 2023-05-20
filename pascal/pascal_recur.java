import java.util.*;
public class pascal_recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k =0 ; k <=i; k++) {
                int pos_value = factorial(i) / (factorial(i - k) * factorial(k));
                System.out.print(pos_value + " ");
            }

            System.out.println();
        }
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int fact=1;
        fact=n*factorial(n-1);
        return fact ;
    }
}