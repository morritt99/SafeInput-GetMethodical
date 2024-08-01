import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        SafeInput.prettyHeader("Get Date of Birth");

        Scanner pipe = new Scanner(System.in);

        String brithYearPrompt = "Enter you birth year ";

        int year = SafeInput.getRangedInt(pipe, brithYearPrompt, 1950, 2015);

        String brithMonthPrompt = "Enter you birth Month ";

        int month = SafeInput.getRangedInt(pipe, brithMonthPrompt, 1, 12);

        String brithDayPrompt = "Enter you birth day ";

        int day = validateDay(pipe, brithDayPrompt, month);

        String dob = day + "/" + month + "/" + year;

        System.out.println("Your date of birth is " + dob);

    }
    private static int validateDay(Scanner pipe, String brithDayPrompt, int month) {

        switch (month) {

            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:

                return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 31);

            case 4:

            case 6:

            case 9:

            case 11:

                return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 30);

            case 2:

                return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 29);

        }

        return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 12);

    }

}