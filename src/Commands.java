import java.util.Scanner;

public class Commands {
    public static void start() {
        System.out.println("You've opened FlashText.  Use the help command at any time.");
        Scanner scanner = new Scanner(System.in);
        String response = "null";
        while (!response.equals("exit")) {

            System.out.print("Enter a command: ");
            response = scanner.nextLine();
            System.out.println();

            if (response.equals("help")) {
                System.out.println("The commands are man, show, flip, primary, secondary, and exit.");
                System.out.println("For more info, type commandName -help");
                continue;
            }

            if (response.equals("man")) {
                System.out.println();
                System.out.println("FlashText is a simple program designed to assist with studying.\nThe motivation of FlashText's inception was to alleviate the burden of maintaining countless physical flash cards, having to use a pen,\nto enjoy the comfort from using an electronic device, and to reap many benefits\n(such as sending the FlashText file, ease of editing, or being able to multitask on a device easier).\n\nSimulating ordinary flash cards, 'NoteCards' are created using the add command, and have two 'sides'.\nOne side is the 'front' side, and includes a question or a term.  The other side is the 'back' (or 'flip') side and includes the answer or description.\nThere is no limit to the quantity of NoteCards that can be added, but it's recommended to organize each FlashText file by topic.\n\nTo see the contents of the back side, use the flip command.  To return to the front side, use the flip command again.\nIt's recommended to recall the other side from personal memory prior to flipping, and then after flipping, assess for mastery.\nIf recalled successfully, put the current NoteCard in the 'primary' pile.  If the recall was not satisfactory, put it in the 'secondary' pile.\nUpon completing the current pile, go over all the NoteCards in the secondary pile again,\npreferably after some more studying and some time has elapsed, to reassess for mastery of the content.\nReiterate this process until all cards go to into the primary pile (reassembling the whole pile), then complete a perfect iteration to confirm mastery.\n\nIt is recommended to return to each FlashText file and go over the NoteCards perdiodically\nto ensure acute mental freshness, reevaluation, and to deeply engrain all content into long term personal memory\nUtilize memorization techniques such as association, mneumonics, acronyms, chunking, mapping, chaining, and most importantly, spaced repetition.\n\nThis program was designed by Andrey Lukashuk.  Good luck on any goals you may have.\n\"How do you eat an elephant? One byte at a time.\"\n");
                continue;
            }
            if (response.equals("primary -help")) {
                System.out.println("This will place the current NoteCard in the primary pile.  This pile should only contain mastered terms and concepts.");
                continue;
            }
            if (response.equals("secondary -help")) {
                System.out.println("This will place the current NoteCard in the secondary pile.  This pile should contain terms and concepts not yet mastered.");
                continue;
            }
            if (response.equals("show -help")) {
                System.out.println("Shows the content of the current card.");
                continue;
            }
            if (response.equals("man -help")) {
                System.out.println("Short for manual.  This command provides a detailed description of the FlashText program.");
                continue;
            }
            if (response.equals("exit -help")) {
                System.out.println("FlashText will be terminated.");
                continue;
            }
            if (response.equals("flip -help")) {
                System.out.println("This will show the content from the other side of the NoteCard.");
                continue;
            }
            if (response.equals("show")) {
                show();
                continue;
            }
            if (response.equals("flip")) {
                flip();
                continue;
            }
            if (response.equals("primary")) {
                primary();
            }else {
                if (!response.equals("exit")) {
                    System.out.println(response.trim() + " is not a valid command.  Use the help command to see all available commands.");
                } else {
                    System.out.println("You have terminated FlashText.");
                }
            }
        }
    }
    public static void show() {

        if (Cards.side) {
            System.out.println(Cards.pile[Cards.i].front);
        } else {
            System.out.println(Cards.pile[Cards.i].back);
        }
    }
    public static void flip() {
        Cards.side = !Cards.side;
        show();
    }
    public static void primary() {
        if (!(Cards.i == 0)) {
            System.out.println();
            System.out.println(Cards.pile[Cards.i].front + " has been added to the primary pile.");
            Cards.i++;
            Cards.side = true;
        } else {
            System.out.println();
            System.out.println("The first card of the stack has been added to the primary pile.  Use the 'show' command to continue.");
            Cards.i++;
            Cards.side = true;
        }
    }
}
