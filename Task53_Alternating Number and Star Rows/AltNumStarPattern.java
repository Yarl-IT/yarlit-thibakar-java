public class AltNumStarPattern {
    public static void main(String[] args) {

        int x = 5;

        for (int i = 1; i <= x; i++) {

            if (i % 2 != 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(i);
                }
            } else {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}