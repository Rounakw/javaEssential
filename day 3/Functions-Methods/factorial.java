import java.util.Scanner;

public class factorial {

    public static int factorialOf(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int fact = factorialOf(n);
        System.out.println("Factorial of : " + fact);

    }
}
