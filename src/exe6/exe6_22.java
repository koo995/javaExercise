package src.exe6;


public class exe6_22 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        String str2 = "123o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str2));
    }

    static String isNumber(String str) {
        if (str == null || str == "") {
            return "false";
        }
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (!(0 <= c && c <= 9)) {
                return "false";
            }
        }
        return "true";

    }
}
