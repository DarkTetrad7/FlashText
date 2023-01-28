public class Main {

    public static void main(String[] args) {
        Cards card0 = new Cards("This is the first card of the stack.  Use the 'flip' command to see the back side.", "This is the back side of the first card.  Use the 'primary' command to add it to the pile and continue onto the next card.");
        Cards.pile[0] = card0;
        Cards.i = 0;
        Commands.start();
    }
}
