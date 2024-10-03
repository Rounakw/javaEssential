import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                System.out.print("* ");
            }
            System.err.println("");
        }

    }
}
