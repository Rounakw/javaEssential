public class PrintSubArray {

    public static void printSubArray(int array[]) {
        int start, end;
        for (int i = 0; i <= array.length - 1; i++) {

            for (int j = i; j <= array.length - 1; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + ",");
                }
                System.out.println();

            }
            System.err.println();
        }

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        printSubArray(array);

    }
}
