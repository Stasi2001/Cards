import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardTrick {

    public static List<PlayingCard> readCardsFromFile(String filename) {
        List<PlayingCard> cards = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                PlayingCard card = new PlayingCard(parts[0], Suit.valueOf(parts[1]));
                cards.add(card);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cards;
    }

    public static void sortCardsByRank(List<PlayingCard> cards) {
        Collections.sort(cards, (card1, card2) -> card1.getDignity().compareTo(card2.getDignity()));
    }

    public static void main(String[] args) {
        List<PlayingCard> cards = readCardsFromFile("cards.txt");
        sortCardsByRank(cards);
        for (PlayingCard card : cards) {
            System.out.println(card);
        }
    }
}