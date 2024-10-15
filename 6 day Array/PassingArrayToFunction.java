public class PassingArrayToFunction {

    public static void update(int marks[], int notChangable) {
        notChangable = 16;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {

        int marks[] = { 97, 98, 99 };
        int notChangable = 12;

        // call by referance cz array always call by reff
        update(marks, notChangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(notChangable);

    }
}
