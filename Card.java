import java.util.Arrays;
import java.util.Objects;

public class Card implements Comparable<Card> {

    public static final String[] RANKS = {null,"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};
    private final int rank;
    private final int suit;
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return RANKS[rank]+" @ "+ SUITS[suit];
    }
    public int compareTo(Card that) {
        if (this.equals(that)){
            return 0;
        }
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 666;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public static void main(String[] args) {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        System.out.println(Arrays.toString(cards));
    }
}
