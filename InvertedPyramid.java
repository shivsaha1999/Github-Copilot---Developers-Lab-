public class InvertedPyramid {
    public static void main(String[] args) {
        int row = 5;

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("o");
            }

            System.out.println();
        }
    }
}