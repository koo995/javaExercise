package src.exe1_5;

public class exe4 {
    public static void main(String[] args) {
        ex5_8();
        exe4_5();
        exe4_10();
        exe4_10_2();
        exe4_15();
        q3();
    }

    static void ex5_8(){
        System.out.println("exe4.ex5_8");
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i]-1]++;
        }


        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void exe4_5() {
        System.out.println("exe4.exe4_5");
        String star = "*";
        while (star.length() < 11) {
            System.out.print(star);
            star = star + "*";
            System.out.println();
        }
    }

    static void exe4_10() {
        System.out.println("exe4.exe4_10");
        for (int i = 2; i < 10; i++) {
            if (i % 3 == 2) {
                for (int j = 1; j < 4; j++) {
                    int k = i;
                    System.out.print(k + "*" + j + "=" + k * j);
                    k++;
                    System.out.print("\t");
                    System.out.print(k + "*" + j + "=" + k * j);
                    k++;
                    if (k < 10) {
                        System.out.print("\t");
                        System.out.print(k + "*" + j + "=" + k * j);
                    }
                    System.out.println();
                }
                System.out.println("");
            }
        }
    }

    static void exe4_10_2() {
        System.out.println("exe4.exe4_10_2");
        for (int i = 0; i < 3; i++) {
            int c = 2 + 3 * i;
            for (int j = 0; j < 9; j++) {
                int a = c + j % 3;
                int b = j / 3 + 1;
                if (j % 3 == 0) System.out.println();
                if (a <= 9) {
                    System.out.print(a + "*" + b + "=" + a * b);
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }


    static void exe4_15() {
        System.out.println("exe4.exe4_15 회문수");
        int number = 12321;
        int tmp = number;
        int pointer = (int)Math.log10(number);
        while (pointer >= 0) {
            int c = tmp / 10000;
            tmp = tmp % 10000;
            tmp = tmp * 10 + c;
            pointer--;
        }

        if (number == tmp) {
            System.out.println("number = " + number + "는 회문수 입니다.");
        } else {
            System.out.println("number = " + number + "는 회문수가 아닙니다.");
        }
    }

    static void q3() {
        System.out.println("exe4.q3");
        int[] arr = {1, 7, 2, 1, 7, 3, 5, 3, 3};
        int[] map = new int[10];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]]++;
        }
        System.out.println("중복을 제거한 결과");
        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("정렬된 결과");
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) continue;
            for (int j = 0; j < map[i]; j++) {
                System.out.print(i + " ");
            }
        }

    }
}
