package animalpicker;

import java.util.*;

public class animalpicker {
    public static String selection;
    public static int tracker = 0;

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal would you like to see? \nCat or Dog?");
        selection = scanner.next().toLowerCase();
    }
    public static void main(String[] args) {

        animalpicker.input();

        while (tracker == 0){
            if (selection.equals("cat")) {
                tracker = 1;
                System.out.println("CAT ASCII ART HERE");
            }
            else if (selection.equals("dog")) {
                tracker = 1;
                System.out.println("DOG ASCII ART HERE");
            }
            else {
                tracker = 0;
                System.out.println("Invalid input");
                animalpicker.input();
            }
        }
    }
}