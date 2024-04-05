public class FibSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, sum;

        System.out.print(num1 + " " + num2 + " ");

        while ((num1 + num2) <= 100) {
            sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
    }
}