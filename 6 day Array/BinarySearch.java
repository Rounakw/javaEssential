public class BinarySearch {

    public static int BS(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 5, 6, 7, 8, 9 };
        int key = 7;

        int index = BS(array, key);

        System.out.println(index);
    }
}
