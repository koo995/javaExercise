package src.exe6.q1;

public class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        int i = 0;
        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int idx = (int) (Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[idx];
            cardArr[idx] = temp;
        }
    }

}
