package src.exe9;

public class exe9_11 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            if (checkRange(n, m)) {
                printGugudan(n, m);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
        }
    }

    static void printGugudan(int n, int m) {
        for (; n <= m; n++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(n + "*" + i + "=" + n * i);
            }
            System.out.println();
        }
    }

    static boolean checkRange(int n, int m) {
        if ((n < 2 || n > 9) || (m < 2 || m > 9)) {
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
            return false;
        }
        return true;
    }
}

