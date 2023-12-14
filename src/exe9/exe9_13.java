package src.exe9;

public class exe9_13 {
    public static void main(String[] args) {
        String src = "*aabbc*cAABBCCa*a23*";
        System.out.println("src = " + src);
        System.out.println("aa를 " + stringCount(src, "*") + "개 찾았습니다.");
    }

    private static int stringCount(String src, String key) {
        return stringCount(src, key, 0);

    }

    private static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;

        if (key == null || key.length() == 0) {
            return 0;
        }

        while (true) {
            index = src.indexOf(key, pos);
            if (index == -1) {
                return count;
            }
            count++;
            pos = index + key.length();
        }
    }
}
