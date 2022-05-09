import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<Integer>();

        System.out.println("Enter some integers. Enter 0 when you want to stop, then I will add them all together for you.");

        while (true) {
            Integer input = Integer.parseInt(in.nextLine());

            if (input == 0) {
                break;
            } else {
                intList.add(input);
            }
        }

        System.out.print("You entered: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println("The sum of that list is " + sum(intList));

        in.close();
    }

    public static int sum(ArrayList<Integer> list) {
        int total = 0;

        for (int num : list) {
            total += num;
        }

        return total;
    }
}
