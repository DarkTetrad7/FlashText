import java.util.Scanner;

public class Commands {
    public static int seCounter = 0;
    public static int secP = 0;
    public static int secC = 0;
    public static void primaryRestart() {
        System.out.println("You have mastered the pile, and it is now shuffled.");
        secP = 0;
        secC = 0;
        seCounter = Cards.pile.size();
        Cards.secondaryPile.addAll(Cards.pile);
        Scanner scanner = new Scanner(System.in);
        String response = "null";
        while (!response.equals("exit")) {

            System.out.print("Enter a command: ");
            response = scanner.nextLine();
            System.out.println();

            if (response.equals("help")) {
                System.out.println("The commands are man, load, draw, flip, primary, secondary, and exit.");
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
            if (response.equals("load -help")) {
                System.out.println("Allows for adding new NoteCards to the pile.  Follow the prompt");
            }
            if (response.equals("save -help")) {
                System.out.println("Saves a currently loading card.");
            }
            if (response.equals("draw -help")) {
                System.out.println("draws the content of the current card.");
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
                System.out.println("This will draw the content from the other side of the NoteCard.");
                continue;
            }
            if (response.equals("draw") || response.equals("dr")) {
                draw();
                continue;
            }
            if (response.equals("flip") || response.equals("fl")) {
                flip();
                continue;
            }
            if (response.equals("load")) {
                load();
                continue;
            }
            if (response.equals("Load")) {
                Load();
                continue;
            }
            if (response.equals("secondary") || response.equals("sec")) {
                secondary();
                continue;
            }
            if (response.equals("primary") || response.equals("pr")) {
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
    public static void secondaryRestart() {
        seCounter = Cards.primaryPile.size();
        Cards.i = 0;
        secP = 0;
        secC = 0;
        System.out.println("You have completed the pile, and are now going to be quizzed on secondary NoteCards.");
        Scanner scanner = new Scanner(System.in);
        String response = "null";
        while (!response.equals("exit")) {

            System.out.print("Enter a command: ");
            response = scanner.nextLine();
            System.out.println();

            if (response.equals("help")) {
                System.out.println("The commands are man, load, draw, flip, primary, secondary, and exit.");
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
            if (response.equals("load -help")) {
                System.out.println("Allows for adding new NoteCards to the pile.  Follow the prompt");
            }
            if (response.equals("save -help")) {
                System.out.println("Saves a currently loading card.");
            }
            if (response.equals("draw -help")) {
                System.out.println("draws the content of the current card.");
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
                System.out.println("This will draw the content from the other side of the NoteCard.");
                continue;
            }
            if (response.equals("draw") || response.equals("dr")) {
                draw();
                continue;
            }
            if (response.equals("flip") || response.equals("fl")) {
                flip();
                continue;
            }
            if (response.equals("load")) {
                load();
                continue;
            }
            if (response.equals("Load")) {
                Load();
                continue;
            }
            if (response.equals("secondary") || response.equals("sec")) {
                secondary();
                continue;
            }
            if (response.equals("primary") || response.equals("pr")) {
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
    public static void begin() {
        System.out.println("You've opened FlashText.  Use the help command at any time.");
        Scanner scanner = new Scanner(System.in);
        String response = "null";
        while (!response.equals("exit")) {

            System.out.print("Enter a command: ");
            response = scanner.nextLine();
            System.out.println();

            if (response.equals("help")) {
                System.out.println("The commands are man, load, draw, flip, primary, secondary, and exit.");
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
            if (response.equals("load -help")) {
                System.out.println("Allows for adding new NoteCards to the pile.  Follow the prompt");
            }
            if (response.equals("save -help")) {
                System.out.println("Saves a currently loading card.");
            }
            if (response.equals("draw -help")) {
                System.out.println("draws the content of the current card.");
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
                System.out.println("This will draw the content from the other side of the NoteCard.");
                continue;
            }
            if (response.equals("draw") || response.equals("dr")) {
                draw();
                continue;
            }
            if (response.equals("flip") || response.equals("fl")) {
                flip();
                continue;
            }
            if (response.equals("load")) {
                load();
                continue;
            }
            if (response.equals("Load")) {
                Load();
                continue;
            }
            if (response.equals("secondary") || response.equals("sec")) {
                secondary();
                continue;
            }
            if (response.equals("primary") || response.equals("pr")) {
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
    public static void draw() {

        if (0 == Cards.secondaryPile.size()) {
            primaryRestart();
        }
        if (seCounter == secP + secC) {
            secondaryRestart();
        }
        if (Cards.side) {
            System.out.println(Cards.secondaryPile.get(Cards.i).front);
        } else {
            System.out.println(Cards.secondaryPile.get(Cards.i).back);
        }
    }
    public static void flip() {
        Cards.side = !Cards.side;
        draw();
    }
    public static void primary() {
        Cards.secondaryPile.remove(Cards.i);
        Cards.side = true;
        secP++;
    }

    public static void secondary() {
        Cards.primaryPile.remove(Cards.i);
        Cards.side = true;
        secC++;
        Cards.i++;
    }

    public static void load() {
        System.out.print("Enter the front of the card: ");
        Scanner scanner = new Scanner(System.in);
        String fr = scanner.nextLine();
        System.out.print("Enter the back of the card: ");
        String bk = scanner.nextLine();
        System.out.println("");
        Cards card = new Cards(fr, bk);
        Cards.pile.add(card);
        Cards.primaryPile.add(card);
        Cards.secondaryPile.add(card);
        seCounter++;
    }

    public static void Load() {
        String fr = "Don't stop";
        while (!(fr.equals("stop"))) {
            System.out.print("Enter the front of the card: ");
            Scanner scanner = new Scanner(System.in);
            fr = scanner.nextLine();
            if (fr.equals("stop")) {
                System.out.println("");
                continue;}
            System.out.print("Enter the back of the card: ");
            String bk = scanner.nextLine();
            System.out.println("");
            Cards card = new Cards(fr, bk);
            Cards.pile.add(card);
            Cards.primaryPile.add(card);
            Cards.secondaryPile.add(card);
            seCounter++;
        }
    }
}
