public class PlayingCard {
        private String dignity;
        private Suit suit;

        public enum Suit {
            HEARTS, DIAMONDS, CLUBS, SPADES
        }

        public PlayingCard(String dignity, Suit suit) {
            this.dignity = dignity;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return dignity+suit;
        }
    }
