package src.exe9;

public class exe9_7 {

    public static boolean contain(String src, String target) {
        return (src.indexOf(target) != -1) ? true:false;
    }

    public static void main(String[] args) {
        System.out.println(contain("12345", "23"));
        System.out.println(contain("12345", "67"));
    }
}
