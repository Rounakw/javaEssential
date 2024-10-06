
public class diamond {
    public static void main(String[] args) {
        int n = 5;

        // upper pattern
        for (int i = 1; i <= n; i++) {
            // prints spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower pattern
        for (int i = n; i >= 0; i--) {
            // prints spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
