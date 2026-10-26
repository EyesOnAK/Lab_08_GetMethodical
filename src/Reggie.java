import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (e.g., 000-00-0000)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (e.g., M12345)", "^(M|m)\\d{5}$");
        System.out.println("Valid M-Number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [O/S/V/Q]", "^[OoSsVvQq]$");
        System.out.println("Choice accepted: " + menuChoice);
    }
}