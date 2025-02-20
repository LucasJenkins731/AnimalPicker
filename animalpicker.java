package animalpicker;

import java.util.*;

public class animalpicker {
    public static String selection;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What animal would you like to see? \nCat or Dog?");

        selection = scanner.next().toLowerCase();

        if (selection.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        }
        else if (selection.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        }
    }
}