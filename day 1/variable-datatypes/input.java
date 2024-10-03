import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int product = a * b;

        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;

        System.out.println(area);
    }
}
