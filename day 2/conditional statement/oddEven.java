import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        if (number % 2 == 0) {
            System.out.println("EVEN!");
        } else {
            System.out.println("ODD!");
        }

    }
}
