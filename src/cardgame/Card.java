package cardgame;

/**
 * A playing card in a standard American deck of cards.
 *
 * Card instances are immutable.
 */
public class Card {

    //牌的花色
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    };

    //牌的大小
    public enum Number {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    };

    public Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        return number + " of " + suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Number getNumber() {
        return number;
    }

    private final Suit suit;
    private final Number number;

}
