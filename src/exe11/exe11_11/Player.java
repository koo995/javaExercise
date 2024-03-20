package src.exe11.exe11_11;

class Player {
    String name;
    SutdaCard c1;
    SutdaCard c2;

    int point;

    public Player(String name, SutdaCard c1, SutdaCard c2) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", c1=" + c1 +
                ", c2=" + c2 +
                ", point=" + point +
                '}';
    }
}
