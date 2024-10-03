import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you are adult!");
        } else if (age > 13 && age < 18) {
            System.out.println("you are teenage!");
        } else {
            System.out.println("you are child!");
        }
    }
}
