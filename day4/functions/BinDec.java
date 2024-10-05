package day4.functions;

public class BinDec {

    public static int calculateBinToDec(int n) {
        int dec = 0;
        int pow = 0;
        int lastDigit;

        while (n != 0) {
            lastDigit = n % 10; // calculate last digit
            dec = (int) (dec + lastDigit * Math.pow(2, pow)); // calculate decimal value
            pow++; // increase power in every loop
            n /= 10; // small n by removing last digit
        }
        return dec;
    }

    public static int calculateDecToBin(int n) {
        int pow = 0;
        int bin = 0;
        int rem;

        while (n != 0) {
            rem = n % 2;
            bin = bin + (rem * (int) (Math.pow(10, pow)));
            pow++;
            n /= 2;
        }

        return bin;
    }

    public static void main(String[] args) {
        // System.out.println(calculateBinToDec(111));
        System.out.println(calculateDecToBin(7));
    }
}
