import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int favInt = SafeInput.getInt(console, "Enter Your Favorite integer");
        double favDouble = SafeInput.getDouble(console, "Enter Your Favorite double");

        System.out.println("\nYour favorite int and favorite double are: " + favInt + " & " + favDouble);

    }
}
