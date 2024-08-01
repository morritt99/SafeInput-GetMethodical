import java.util.Scanner;

/**
 *
 * @author
 */
public class Reggie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in  = new Scanner (System.in);
        String ssn = "";
        String mNum = "";
        String menu = "O - open S - save V - view Q - quit";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        mNum = SafeInput.getRegExString(in, "Enter your M Number", "M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");
    }

}