package src.exe6;

import java.util.Arrays;

public class exe6_23 {
    public static void main(String[] args) {

        int[] data = {3, 2, 1, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));

    }

    private static String max(int[] ints) {
        if (ints == null || ints.length == 0) {
            return "-999999";
        }
        int maxValue = -1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maxValue) {
                maxValue = ints[i];
            }
        }
        return String.valueOf(maxValue);

    }

}
