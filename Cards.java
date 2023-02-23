import java.util.ArrayList;

public class Cards {
    public static int i = 0;

    public String front;
    public String back;
    public static boolean side = true;

    public Cards(String front, String back) {
        this.front = front;
        this.back = back;
    }

    static ArrayList<Cards> pile = new ArrayList<Cards>();

    static ArrayList<Cards> primaryPile = new ArrayList<Cards>();

    static ArrayList<Cards> secondaryPile = new ArrayList<Cards>();

}