package src.exe9;

public class exe9_10 {
    public static String format(String str, int length, int alignment) {
        if (length < str.length()) {
            return str.substring(0, length);
        }
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            arr[i] = ' ';
        }

        int desIdx = (alignment > 0) ?
                (alignment == 1) ?
                        Math.round((length - str.length()) / 2) :
                        length - str.length() :
                0;
        System.arraycopy(str.toCharArray(), 0, arr, desIdx, str.length());
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str = "가나다라";
        System.out.println(format(str, 7,0));
        System.out.println(format(str, 7,1));
        System.out.println(format(str, 7,2));
    }
}
