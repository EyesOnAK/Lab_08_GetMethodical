import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int maxDays = 31;
        switch (birthMonth)
        {
            case 2:
                maxDays = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }

        int birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDays);
        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("\nDate and Time of Birth:");
        System.out.println(birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}