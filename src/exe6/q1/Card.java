package src.exe6.q1;

public class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 4;
    static final int HEART = 4;
    static final int CLOVER = 4;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind=" + kind +
                ", number=" + number +
                '}';
    }

    public int getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }


}
