import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMoreItems = false;

        do
        {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter price of item", 0.50, 10.00);
            totalCost += itemPrice;

            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to check out?");
        } while (hasMoreItems);

        System.out.printf("\nTotal cost: $%.2f\n", totalCost);
    }
}