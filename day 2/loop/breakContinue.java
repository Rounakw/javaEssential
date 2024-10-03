import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter value: ");
            int n = sc.nextInt();
            // if (n % 10 == 0) {
            // break;
            // }

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("You entered " + n);

        }

    }
}
