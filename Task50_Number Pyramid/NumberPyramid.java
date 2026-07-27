public class NumberPyramid {
    public static void main(String[] args) {

        int x = 5;

        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}