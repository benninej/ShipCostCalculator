import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        final double SHIP_RATE = 0.02;
        double shipCost = 0.0;

        System.out.println("Enter the item price");
        itemPrice = input.nextDouble();

        if (itemPrice >= 100)
        {
            shipCost = 0.0;
            totalPrice = itemPrice;
        }
        else
        {
            shipCost = itemPrice * SHIP_RATE;
            totalPrice = itemPrice + shipCost;
        }
        System.out.println("The shipping cost is $" + shipCost);
        System.out.println("The total price is $" + totalPrice);
    }
}
