import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // int ctr = 1;
        // while (ctr <= 10) {
        // System.out.println(ctr + ". Hello World");
        // ctr += 1;

        Scanner sc = new Scanner(System.in);
        // int ctr = 1;
        // int max = sc.nextInt();
        // while (ctr <= max) {
        // System.out.println(ctr);
        // ctr += 1;
        // }

        // sum of first n natarul number
        int n = sc.nextInt();
        int sum = 0;
        while (n >= 0) {
            sum = sum + n;
            n -= 1;
        }
        System.out.println(sum);

    }
}