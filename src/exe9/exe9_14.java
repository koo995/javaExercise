package src.exe9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exe9_14 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = sc.nextLine().trim();

            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }
            /**
             * 여기서 일치하는 것을 찾자.
             */
            Pattern p = Pattern.compile(input);
            for (String phoneNum : phoneNumArr) {
                Matcher m = p.matcher(phoneNum);
                if (m.find()) {
                    list.add(phoneNum);
                }
            }

            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }

        }

    }
}
