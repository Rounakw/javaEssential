
public class Butterfly {
    public static void main(String[] args) {
        int n = 10;
        // upward pattern
        for (int i = 1; i <= n; i++) {
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
