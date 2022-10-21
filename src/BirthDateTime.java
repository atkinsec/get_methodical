import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int year = SafeInput.getRangedInt(console, "Enter Your Birth Year", 1950, 2010);
        int month = SafeInput.getRangedInt(console, "Enter Your Birth month", 1, 12);

        int dayHigh = 2;
        String monthWord = "";

        switch (month) {
            case 1:
                monthWord = "January";
                dayHigh = 31;
                break;
            case 2:
                monthWord = "February";
                dayHigh = 29;
                break;
            case 3:
                monthWord = "March";
                dayHigh = 31;
                break;
            case 4:
                monthWord = "April";
                dayHigh = 31;
                break;
            case 5:
                monthWord = "May";
                dayHigh = 31;
                break;
            case 6:
                monthWord = "June";
                dayHigh = 30;
                break;
            case 7:
                monthWord = "July";
                dayHigh = 31;
                break;
            case 8:
                monthWord = "August";
                dayHigh = 31;
                break;
            case 9:
                monthWord = "September";
                dayHigh = 30;
                break;
            case 10:
                monthWord = "October";
                dayHigh = 31;
                break;
            case 11:
                monthWord = "November";
                dayHigh = 30;
                break;
            case 12:
                monthWord = "December";
                dayHigh = 31;
                break;
        }


        int day = SafeInput.getRangedInt(console, "Enter Your Birth day", 1, dayHigh);
        int hour = SafeInput.getRangedInt(console, "Enter Your Birth hour", 1, 23);
        int minute = SafeInput.getRangedInt(console, "Enter Your Birth minute", 1,59);

        System.out.println("\nYour birthdate is: " + monthWord + " " + day + " " + year + " at " + hour + ":" + minute);

    }
}
