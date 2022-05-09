import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> inputStrings = new ArrayList<String>();

        System.out.println("Enter some strings. Enter an empty string when you want to stop.");

        while (true) {
            String input = in.nextLine();

            if (input == "") {
                break;
            } else {
                inputStrings.add(input);
            }
        }

        System.out.println("You entered " + inputStrings.size() + " strings.");

        in.close();
    }
}
