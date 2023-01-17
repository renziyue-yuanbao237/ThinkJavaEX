import java.util.Arrays;
import java.util.Objects;

enum Suit {
    Club, Diamond, Heart, Spade
}
enum Rank {
    RA, R2, R3, R4, R5, R6, R7, R8, R9, RX, RJ, RQ, RK
}
public class CardEnum implements Comparable<CardEnum> {
    private Suit suit;
    private Rank rank;
    public CardEnum(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public int compareTo(CardEnum that) {
        int suitCompare = this.suit.compareTo(that.suit);
        if (suitCompare != 0) { //不相等
            return suitCompare;
        } else {
            return this.rank.compareTo(that.rank);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardEnum cardEnum = (CardEnum) o;
        return suit == cardEnum.suit && rank == cardEnum.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public String toString() {
        return suit+" "+rank;
    }

    public static void main(String[] args) {
        CardEnum[] cards = new CardEnum[52];
        int index = 0;
        for (Suit suit :Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index] = new CardEnum(suit, rank);
                index++;
            }
        }
        System.out.println(Arrays.toString(cards));
    }
}
