package src.exe6;

public class exe6_24 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(abs(value));
        System.out.println(abs(-10));

    }

    private static int abs(int i) {
        return (i >= 0) ? i : i*(-1);
    }
}
