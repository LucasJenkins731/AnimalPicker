package AnimalPicker;

import java.util.*;

public class animalpicker {
    public static String selection;
    public static int tracker = 0;

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What ASCII art would you like to see? \nCat, Dog, Homer, Fish, or Dolphin?");
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
            else if (selection.equals("homer")) {
                tracker = 1;
                System.out.println("   ___  _____    \n .\'/,-Y\"     \"~-.  \n l.Y             ^.           \n /\\               _\\_      \"Doh!\"   \ni            ___/\"   \"\\ \n|          /\"   \"\\   o !   \nl         ]     o !__./   \n \\ _  _    \\.___./    \"~\\  \n  X \\/ \\            ___./  \n ( \\ ___.   _..--~~\"   ~`-.  \n  ` Z,--   /               \\    \n    \\__.  (   /       ______) \n      \\   l  /-----~~\" /      -Row\n       Y   \\          / \n       |    \"x______.^ \n       |           \\    \n       j            Y");
            }
            //adding dolphin ASCII art
            else if (selection.equals("dolphin")){
                tracker = 1;
                System.out.println("                                                                ,.\n                                                               /  \\\n                                                              /..-\'\n                                                             .\'\n                                      __.-,\'\',--,..\n           ,-.                    ,-\'\'  .\',-\\\' / _ |\n           |  |              ,,\'``      //  |   \'| `\n           `. |          _.-\' /\'        | ()|  ()|(,.-\'\'\'\'\'-.\n             \'`        ,\'    /         --.  | \'--\'          /\n                    _,\'     /              -\'      __..._ ,\'\n                   /       /                   _,-\'    ,.-\n     .-.         ,\'       /       _,.....,\'- .\'_  ,-:-\'\n     \\  \\      .\'        /       \'          `.` \\  \\\n      `. |     `..---._ /     _. --           \'-._..\\.\n        `\\             .  _,-\'           ..         _/             _\n         \'             /,\'                 :.___,,.\'            ,-\' |\n                      ,\'                \'\'\'`-                ,,\'   /\n                    ,\'        .         ,-\'|             _.-\'    ,\'\n                   ,\'       ,/        ,\'   |          _,\'    _.-\'\n                  .\'    _.-\'/       ,\'     |         \'  _.-\'\'\n.\'`-.             |  ,-\'   |       /  \\    |       ,:,-\'\n\'.   \\            `-\' |    |     ,\'    \\   |       \'\n `.   \\               |   |     /       `._/\n   `.  `.             |   |    /\n     `-_`.            |   |   |                          _..\'\n        `|.           |   |   |                     _.-\'\'  _/\n          \\            \\  |   |       ,,-\'\\        /.,---`\'\n           \'            \\ |   |   _,-\'   ,\'\n                         \\ \\  |,-\'      /\n                 _        \\ \\ |       ,\'\n                <.`.       \\ \\|      /               _.\n                  \\|        `.      /              /\' ,\'\n                             |     /              /--\'\n                             |    |\n                     |.      |   /\n          _          \' `._   |   |    ,-\'.\n          |\'-.._,,.-\'     `\'\'|   |\'\'\'\'    `.    __.\n          |                   \\  |          `\'\'\'   \\\n         ,\'                    `-\'                  `-....--\'\n     _,,\'                                                   `.\n ,\'\'\'                                                 ,       `-.--\'.\n\'                                                   _\'\n            `.        .       \'.     _ \'           , :\n              -       |.     ,\' `__,\'  \\         ,\' |\n              |`._    | `...-           `._  _,-\'   |\n_             |   `---\'                    `\'        `.  _,\'\n `....,.._   /                                         `\'  \\       _,\n          \'\'\'                                              `.___,,\'");
            }
            else {
                tracker = 0;
                System.out.println("Invalid input");
                animalpicker.input();
            }
        }
    }
}