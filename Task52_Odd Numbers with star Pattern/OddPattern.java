class OddPattern {
    public static void main(String[] args) {

        int[] x= {1, 3, 5};

        for (int i = 1; i <= 5; i++) {
            for (int j=0;j<x.length;j++) {

                System.out.print(x[j]);

                if (j != x.length - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}