import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<Integer>();

        System.out.println("Enter some integers. Enter 0 when you want to stop.");

        while (true) {
            Integer input = Integer.parseInt(in.nextLine());

            if (input == 0) {
                break;
            } else {
                intList.add(input);
            }
        }

        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        int search = Integer.parseInt(in.nextLine());
        int index = intList.indexOf(Integer.valueOf(search));
        System.out.println(search + " is at index " + index);
        in.close();
    }
}
