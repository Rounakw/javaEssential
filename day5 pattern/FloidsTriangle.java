public class FloidsTriangle {
    public static void main(String[] args) {
        int line = 6;
        int ctr = 1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ctr + " ");
                ctr++;
            }
            System.out.println();
        }
    }
}
