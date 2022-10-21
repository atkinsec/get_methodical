import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLength(console, "Enter Your First Name");
        String lastName = SafeInput.getNonZeroLength(console, "Enter Your Last Name");

        System.out.println("\nYour full name is: " + firstName + " " + lastName);

    }
}
