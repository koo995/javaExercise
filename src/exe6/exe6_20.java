package src.exe6;


public class exe6_20 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }

    private static int[] shuffle(int[] original) {
        for (int i = 0; i < 9; i++) {
            int idx = (int)(Math.random()*9);
            int tmp = original[i];
            original[i] = original[idx];
            original[idx] = tmp;
        }
        return original;
    }
}
