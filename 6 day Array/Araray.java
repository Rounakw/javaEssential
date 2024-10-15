import java.util.Scanner;

public class Araray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        // int numbers[] = { 1, 2, 3 };

        // input of 3 element in marks array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // print 0th element
        System.out.println(marks[0]);

        // update the 0th element
        marks[0] = 34;

        // print 0th element
        System.out.println(marks[0]);

        // print the length of array
        System.out.println(marks.length);
    }
}