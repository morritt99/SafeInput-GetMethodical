import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args)
    {
        int favNum = 0;
        Scanner in = new Scanner(System.in);

        favNum = SafeInput.getRangedInt(in, "What is your fav num", 1, 10);

        System.out.println("You said your fav num is: " + favNum);
    }
}
