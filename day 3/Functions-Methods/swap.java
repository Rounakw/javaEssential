public class swap {

    public static void swapTwo(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        return;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapTwo(a, b);

        // not swap the value c.z java calls by value.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
