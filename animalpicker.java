package animalpicker;

import java.util.*;

public class animalpicker {
    public static String selection;
    public static int tracker = 0;

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal would you like to see? \nCat, Dog, or Fish?");
        selection = scanner.next().toLowerCase();
    }
    public static void main(String[] args) {

        animalpicker.input();

        while (tracker == 0){
            if (selection.equals("cat")) {
                tracker = 1;
                System.out.println(" _._     _,-'\"\"`-._\r\n" + //
                                        "(,-.`._,'(       |\\`-/|\r\n" + //
                                        "    `-.-' \\ )-`( , o o)\r\n" + //
                                        "          `-    \\`_`\"'-");
            }
            else if (selection.equals("dog")) {
                tracker = 1;
                System.out.println("^..^      /\r\n" + //
                                        "/_/\\_____/\r\n" + //
                                        "   /\\   /\\\r\n" + //
                                        "  /  \\ /  \\");
            }
            else if (selection.equals("fish")) {
                tracker = 1;
                System.out.println("      .            \r\n" + //
                                        "\\_____)\\_____\r\n" + //
                                        "/--v____ __`<         \r\n" + //
                                        "        )/           \r\n" + //
                                        "        '\r\n" + //
                                        "");
            }
            else {
                tracker = 0;
                System.out.println("Invalid input");
                animalpicker.input();
            }
        }
    }
}