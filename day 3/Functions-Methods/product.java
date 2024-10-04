public class product {
    public static int productOf(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        int prod = productOf(a, b);
        System.out.println("Product is: " + prod);
    }
}
