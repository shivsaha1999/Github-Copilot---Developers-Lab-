import java.util.Scanner;
public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the cart amount: $");
        double cartAmount = scanner.nextDouble();
        
        double discount = 0;
        if (cartAmount < 100) {
            discount = 0.05;
        } else if (cartAmount >= 100 && cartAmount <= 200) {
            discount = 0.1;
        } else if (cartAmount > 200) {
            discount = 0.15;
        }
        
        double totalCost = cartAmount - (cartAmount * discount);
        
        System.out.println("Total cost of the cart: $" + totalCost);
        // System.out.println("Discount amount: $" + (cartAmount * discount));
        System.out.println("Discount percentage: " + (discount * 100) + "%");
    }
}
