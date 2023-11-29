package src.exe6.q1;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Card[] myCards = new Card[5];
        for (int i = 0; i < 5; i++) {
            myCards[i] = deck.cardArr[i];
        }
        System.out.println("myCards = " + Arrays.toString(myCards));
        String result = rankCheck(myCards);
        System.out.println("result = " + result);
    }

    static String rankCheck(Card[] cards) {
        int[] kinds = new int[cards.length];
        int[] numbers = new int[Card.NUM_MAX+1];

        for (Card card : cards) {
            kinds[card.getKind()]++;
            numbers[card.getNumber()]++;
        }
//        kinds = new int[]{0, 5, 0, 0, 0};
        numbers = new int[]{0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
//        numbers = new int[]{0, 0, 1, 0, 3, 2, 0, 0, 1, 0, 0, 0, 0, 0};


        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("kinds = " + Arrays.toString(kinds));

        // 먼저 flush부터 체크하자
        for (int kind : kinds) {
            if (kind == 5) {
                return "flush";
            }
        }

        // straight을 체크하자
        String tmp = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                tmp = tmp + numbers[i];
                if (tmp.equals("11111")) {
                    return "straight";
                }
            } else {
                tmp = "";
            }
        }

        // 나머지
        int pairCount = 0;
        int threeCounter = 0;
        for (int number : numbers) {
            if (number == 4) {
                return "four card";
            }
            if (number == 3) {
                threeCounter++;
            }
            if (number == 2) {
                pairCount++;
            }
        }
        if (threeCounter == 1 && pairCount == 1) {
            return "full house";
        }
        if (threeCounter == 1) {
            return "three card";
        }
        if (pairCount == 2) {
            return "2 pair";
        }
        if (pairCount == 1) {
            return "1 pair";
        }
        return "";
    }


}
