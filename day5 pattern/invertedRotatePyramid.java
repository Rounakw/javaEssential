public class invertedRotatePyramid {
    public static void main(String[] args) {
        int line = 4;

        for (int i = 1; i <= line; i++) {
            // print gap
            for (int j = 1; j <= (line - i); j++) {
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
