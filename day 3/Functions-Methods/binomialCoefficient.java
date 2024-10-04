import java.util.Scanner;

public class binomialCoefficient {

    public static int factorialOf(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binCoef(int n, int r){
        int n_fact = factorialOf(n);
        int r_fact = factorialOf(r);
        int nmc_fact = factorialOf(n-r);

        int nCr = n_fact / (r_fact * nmc_fact);
        return nCr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int nCr = binCoef(n, r);

        System.out.println("Binomial Coefficient : " + nCr);

    }
}
