import java.util.Scanner;

public class largerTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = sc.nextInt();
        System.out.println("Enter value b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater than b.");
        } else {
            System.out.println("b is greater than a.");
        }
    }
}
