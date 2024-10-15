public class Longest {

    public static int largeInArray(int numbers[]) {
        int smallN = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > smallN) {
                smallN = numbers[i];
            }
        }
        return smallN;
    }
    public static int SmallInArray(int numbers[]) {
        int bigN = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < bigN) {
                bigN = numbers[i];
            }
        }
        return bigN;
    }

    public static void main(String[] args) {
        int numbers[] = { 12, 3, 45, 23, 455, 90 };
        int largeNumber = largeInArray(numbers);
        int smallNumber = SmallInArray(numbers);
        System.out.println("Largest number is = " + largeNumber);
        System.out.println("Longest number is = " + smallNumber);
    }
}
