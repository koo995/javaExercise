package src.exe9;

public class exe9_9 {
    public static String delChar(String src, String delCh) {
        StringBuffer result = new StringBuffer();
        for (int j = 0; j < src.length(); j++) {
            char c = src.charAt(j); // 확인할 문자.
            int idx = delCh.indexOf(c); // src안에 제거해야할 문자가 있는지 확인 그러나 여러개면?
            if (idx == -1) {
                result.append(c);
            }
        }
        return result.toString();

        // src한개씩 확인하며 delCh안에 존재하면 제거
        // delCh을 확인하며 src안에 존재하면 제거

    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2    3   4\t5)" + " -> " + delChar("(1 2    3   4\t5)", " \t"));
    }
}
