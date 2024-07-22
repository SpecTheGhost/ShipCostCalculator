import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        String trash = ""; // Use for bad input which will read as a String

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            // OK safe to read in a double
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear the buffer

            double shippingCost;
            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            double totalPrice = itemPrice + shippingCost;

            System.out.println("\nItem price: $" + itemPrice);
            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + totalPrice);

        } else {
            // Not a double, can't use nextDouble(), read as String with nextLine() instead
            trash = in.nextLine(); // Read the input as a String
            System.out.println("\nYou entered an invalid price: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
        }

        in.close(); // Close the scanner
    }
}
