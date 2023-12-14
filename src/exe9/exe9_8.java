package src.exe9;

public class exe9_8 {
    public static double round(double d, int n) {
        double i = Math.pow(10, n);
        return (int) (d * i + 0.5) / i;
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415, 1));
        System.out.println(round(3.1415, 2));
        System.out.println(round(3.1415, 3));
        System.out.println(round(3.1415, 4));
        System.out.println(round(3.1415, 5));
    }
}
