public class HollowRectangle {
    public static void main(String[] args) {
        int row = 10;
        int col = 40;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {

                if (i >= 2 && i < row && j >= 2 && j < col) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
