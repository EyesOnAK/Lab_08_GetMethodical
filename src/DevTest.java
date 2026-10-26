import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Part A
        String testStr = SafeInput.getNonZeroLenString(in, "Test non-zero string");
        System.out.println("Got: " + testStr);

        // Part B
        int testInt = SafeInput.getInt(in, "Test integer");
        System.out.println("Got: " + testInt);

        // Part C
        double testDouble = SafeInput.getDouble(in, "Test double");
        System.out.println("Got: " + testDouble);

        // Part D
        int testRangedInt = SafeInput.getRangedInt(in, "Test ranged int", 1, 10);
        System.out.println("Got: " + testRangedInt);

        // Part E
        double testRangedDouble = SafeInput.getRangedDouble(in, "Test ranged double", 0.5, 9.5);
        System.out.println("Got: " + testRangedDouble);

        // Part F
        boolean testConfirm = SafeInput.getYNConfirm(in, "Continue?");
        System.out.println("Got: " + testConfirm);

        // Part G
        String testRegex = SafeInput.getRegExString(in, "Test SSN format", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Got: " + testRegex);

        // Part H
        SafeInput.prettyHeader("Testing 123");
    }
}