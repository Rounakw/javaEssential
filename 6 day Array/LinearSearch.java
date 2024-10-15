
public class LinearSearch {

    public static int linearSearchInt(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchString(String list[], String item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 13, 67, 45, 34, 23, 12, 63, 37 };
        int key = 44;
        String list[] = { "Rice", "Chicken", "Mutton", "Paneer", "Dal", "Papad" };
        String item = "Paneer";

        // int index = linearSearchInt(numbers, key);
        int index = linearSearchString(list, item);
        if (index == -1) {
            System.out.println("NOT FOUND!");
        } else {
            System.out.println("Key Found At Index = " + index);
        }

    }
}
