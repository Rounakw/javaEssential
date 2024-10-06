
public class Rhombus {

    public static void solidHombus(int n) {
        int m = n;
        for (int i = 1; i <= n; i++) {
            // first spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print stars
            // for (int j = 1; j <= n; j++) {
            // System.out.print("* ");
            // }

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            // last spaces
            for (int j = 1; j <= n - m; j++) {
                System.out.print("  ");
            }
            m--;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        solidHombus(10);
    }
}
