import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {

        SafeInput.prettyHeader("Check out your price");

        double totalPrice = 0.0;

        Scanner pipe = new Scanner(System.in);

        String confirmPrompt = "What to add more price?(Y/N)";

        do {

            String prompt = "Enter price between 0.50 cents to $9.99";

            double price = SafeInput.getRangedDouble(pipe, prompt, 0.50, 9.99);

            totalPrice += price;

        } while (SafeInput.getYNConfirm(pipe, confirmPrompt));

        System.out.println("Total price is " + totalPrice);

    }

}