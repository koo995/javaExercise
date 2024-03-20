package src.exe12;

import java.util.Arrays;

public class exe12_5 {

    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println("c = " + c);
        d.shuffle();
        c = d.pick(0);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    static class Deck {
        @Override
        public String toString() {
            return "Deck{" +
                    "CARD_NUM=" + CARD_NUM +
                    ", cardArr=" + Arrays.toString(cardArr) +
                    '}';
        }

        final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length;
        Card[] cardArr = new Card[CARD_NUM];

        Deck() {
            int i = 0;
            for (Card.Kind kind : Card.Kind.values()) {
                for (Card.Number num : Card.Number.values()) {
                    cardArr[i] = new Card(kind, num);
                    i++;
                }
            }

        }

        Card pick(int index) {
            return cardArr[index];
        }

        Card pick() {
            int index = (int) (Math.random() * CARD_NUM);
            return pick(index);
        }

        void shuffle() {
            for (int i = 0; i < cardArr.length; i++) {
                int r = (int) (Math.random() * CARD_NUM);
                Card temp = cardArr[i];
                cardArr[i] = cardArr[r];
                cardArr[r] = temp;
            }
        }

    }

    static class Card {

        enum Kind {CLOVER, HEART, DIAMOND, SPADE,}

        enum Number {
            ACE, TWO, THREE, FOUR, FIVE,
            SIX, SEVEN, EIGHT, NINE, TEN,
            JACK, QUEEN, KING,
        }

        Kind kind;
        Number num;

        Card() {
            this(Kind.SPADE, Number.ACE);
        }

        public Card(Kind kind, Number num) {
            this.kind = kind;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "kind=" + kind +
                    ", num=" + num +
                    '}';
        }
    }

}

