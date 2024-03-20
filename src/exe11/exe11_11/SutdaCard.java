package src.exe11.exe11_11;

import java.util.Objects;

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
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

    @Override
    public String toString() {
        return "SutdaCard{" +
                "num=" + num +
                ", isKwang=" + (isKwang ? "K" : "") +
                '}';
    }

}
