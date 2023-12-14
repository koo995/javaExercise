package src.exe9;


import java.util.Arrays;

public class exe9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        } else if (length <= 0) {
            return "";
        } else {
            if (src.length() > length) {
                return src.substring(0, length);
            }
            // 여기서 부터는 length가 더 큰 경우다?
            char[] arr = new char[length];
            Arrays.fill(arr, '0');
            for (int i = 0; i < src.length(); i++) {
                arr[length - src.length() + i] = src.charAt(i);
            }
            return String.valueOf(arr);
        }
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,12));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}
