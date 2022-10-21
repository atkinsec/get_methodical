import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        boolean running = true;
        double total = 0;

        do {
            double price = SafeInput.getRangedDouble(console, "Enter Your price of item", 0.50, 9.99);
            total += price;
            running = SafeInput.getYNConfirm(console, "Do you have another item? [Y/N]");
        }while (running);
        System.out.println("Your total is: " + total);



    }
}
