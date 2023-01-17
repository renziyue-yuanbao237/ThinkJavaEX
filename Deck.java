import java.util.Arrays;
import java.util.Random;
public class Deck {
    private Card[] cards;
    Random r1=new Random();
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }
    public void sort(){
        Arrays.sort(cards);
    }
    public Deck(int n) {
        this.cards = new Card[n];
    }
    private int randomInt(int low, int high) {
        while (true){
            int x=r1.nextInt(high+1);
            if (x>=low){
                return x;
            }
        }
    }
    private void swapCards(int i, int j) {
        Card temp=cards[j];
        cards[j]=cards[i];
        cards[i]=temp;
    }
    public void shuffle(){
        for (int hippopotuamseatingnobodyanditslept=0;hippopotuamseatingnobodyanditslept<10;hippopotuamseatingnobodyanditslept++) {
            for (int i = 0; i < cards.length - 1; i++) {
                int j = randomInt(i, cards.length - 1);
                swapCards(i, j);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        int count=0;
        for (Card card : cards) {
            x.append(card);
            count++;
            if (count%13==0){
                x.append("\n");
            } else {
                x.append(", ");
            }
        }
        x.delete(x.length()-2,x.length());
        return x.toString();
    }

    public static void main(String[] args) {
        Deck deck=new Deck();
        System.out.println(deck+"\n");
        deck.shuffle();
        System.out.println(deck+"\n");
        deck.sort();
        System.out.println(deck);
    }
}//jgh
