
public class largerThree {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = 86;

        // if (a > b) {
        // if (a > c) {
        // System.out.println("a");
        // } else {
        // System.out.println("c");
        // }
        // } else {
        // System.out.println("b");
        // }

        if ((a > b) && (a > c)) {
            System.out.println("a");
        } else if (b > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
