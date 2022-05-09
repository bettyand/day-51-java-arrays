import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<String> inputStrings = new ArrayList<String>();

        System.out.println("Enter at least 5 strings. Enter an empty string when you want to stop.");

        while (true) {
            String input = in.nextLine();

            if (input == "") {
                break;
            } else {
                inputStrings.add(input);
            }
        }

        System.out.println("The fifth string you entered was: " + inputStrings.get(4));

        in.close();
    }
}
