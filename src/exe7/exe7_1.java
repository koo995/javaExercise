package src.exe7;

import java.util.Arrays;
import java.util.Objects;

public class exe7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
        deck.shuffle();
        System.out.println();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }

    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int cardNum = (i % 10) + 1;
            boolean isKwang = (i + 1 == 1 || i + 1 == 3 || i + 1 == 8);
            cards[i] = new SutdaCard(cardNum, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int idx = (int) (Math.random() * CARD_NUM);
            SutdaCard tmp = cards[i];
            cards[i] = cards[idx];
            cards[idx] = tmp;
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "k" : "");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SutdaCard sutdaCard = (SutdaCard) o;
        return num == sutdaCard.num && isKwang == sutdaCard.isKwang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, isKwang);
    }
}
