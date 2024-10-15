public class ReverseArrray {

    public static void revOfArray(int array[]) {

        int start = 0;
        int end = array.length - 1;
        int temp;

        while (start < end) {
            temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 7, 8, 4, 31 };

        revOfArray(array);

        for (int i = 0; i <= array.length - 1; i++) {
            System.err.print(array[i]+",");
        }

    }
}
