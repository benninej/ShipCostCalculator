import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        final double SHIP_RATE = 0.02;
        double shipCost = 0.0;
        String trash = "";

        System.out.println("Enter the item price");
        if(input.hasNextDouble())
        {
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
            System.out.printf("Item price: $%.2f\n", itemPrice);
            System.out.printf("Shipping cost: $%.2f\n", shipCost);
            System.out.printf("Total price: $%.2f\n",  totalPrice);
        }
        else
        {
            trash = input.nextLine();
            System.out.println("Invalid input.");
            System.out.println("\nExiting Program. Enter valid input.");
            System.exit(0);
        }
    }
}
