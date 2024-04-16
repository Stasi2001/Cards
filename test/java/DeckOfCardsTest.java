import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class DeckOfCardsTest {

    @Test
    public void testSortingCardsByDignity() {
        List<PlayingCard> cards = Arrays.asList(new PlayingCard("10", Suit.HEARTS), new PlayingCard("K", Suit.DIAMONDS), new PlayingCard("3", Suit.CLUBS));
        CardTrick.sortCardsByRank(cards);
        assertEquals("3 of CLUBS", cards.get(0).toString());
        assertEquals("10 of HEARTS", cards.get(1).toString());
        assertEquals("K of DIAMONDS", cards.get(2).toString());
    }
}