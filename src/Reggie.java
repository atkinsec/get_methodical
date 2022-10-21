import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        SafeInput.getRegExString(console, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        SafeInput.getRegExString(console, "Enter your M#", "(M|m)\\d{8}");
        SafeInput.getRegExString(console, "Open, Save, View, or Quit [O/S/V/Q]", "[OoSsVvQq]");
    }
}
