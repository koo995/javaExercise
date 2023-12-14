package src.exe9;

public class exe9_12 {

    static int getRand(int from, int to) {
        return Math.min(from, to) + (int)(Math.random() * (Math.abs(to - from) +1 ));

    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(22, -5) + ",");
        }
    }
}
