public class revStar {
    public static void main(String[] args) {
        int l = 5;

        for (int i = 1; i <= l; i++) {
            for (int j = l + 1 - i; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
