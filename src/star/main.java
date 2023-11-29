package src.star;

public class main {

    public static void main(String[] args) {
        main.star1();
        main.star2();
        main.star3();
        main.star4();
        main.star5();
        main.star6();
        main.star7();
        main.star8(5);
        main.star82();
        main.star9(5);
        main.star92();
        main.star10();
    }

    static void star1() {
        System.out.println("-----------star1--------------");
        for(int i = 0 ; i < 5; i++) {
            for( int j = 0 ; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star2() {
        System.out.println("-----------star2--------------");
        for( int i = 0 ; i < 5; i++) {
            for ( int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void star3() {
        System.out.println("-----------star3--------------");
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j + i == 4) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void star4() {
        System.out.println("-----------star4--------------");
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j) || (i + j == 4)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void star5() {
        System.out.println("-----------star5--------------");
        for( int i = 1 ; i < 6; i++) {
            System.out.print("*****" + "*".repeat(i));
            System.out.println();
        }
    }

    static void star6() {
        System.out.println("-----------star6--------------");
        for (int i = 5; i > 0; i--) {
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }

    static void star7() {
        System.out.println("-----------star7--------------");
        for (int i = 1; i < 6; i++) {
            if (i != 4) {
                System.out.println("*".repeat(i));
            }
        }
    }


    interface Recur {
        void oper(int maxN, int n);
    }

    static void star8(int n) {
        System.out.println("-----------star8--------------");
        Recur rec = new Recur() {
            @Override
            public void oper(int maxN, int n) {
                if (n <= 1) {
                    System.out.println(" ".repeat((maxN - n) / 2) + "*".repeat(n) + " ".repeat((maxN - n) / 2));
                    return;
                }
                System.out.println(" ".repeat((maxN - n) / 2) + "*".repeat(n) + " ".repeat((maxN - n) / 2));
                oper(maxN,n - 2);
                System.out.println(" ".repeat((maxN - n) / 2) + "*".repeat(n) + " ".repeat((maxN - n) / 2));
            }
        };
        int maxN = n;
        rec.oper(maxN, n);
    }

    static void star82() {
        System.out.println("-----------star8.2--------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (((i <= j) && (i + j <= 4)) || ((i >= j)&&(i + j >= 4))) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star9(int n) {
        System.out.println("-----------star9--------------");
        Recur rec = new Recur() {
            @Override
            public void oper(int maxN, int n) {
                if (n <= 1) {
                    System.out.println("*".repeat(maxN));
                    return;
                }
                System.out.println("*".repeat((maxN - n)/2 + 1) + " ".repeat(n-2) + "*".repeat((maxN - n)/2 + 1));
                oper(maxN,n - 2);
                System.out.println("*".repeat((maxN - n)/2 + 1) + " ".repeat(n-2) + "*".repeat((maxN - n)/2 + 1));
            }
        };
        int maxN = n;
        rec.oper(maxN, n);
    }

    static void star92() {
        System.out.println("-----------star9.2--------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (((i + j <= 4) && (i >= j)) || ((i <= j) && (i + j >= 4))) { // 8번에서 얻은것의 !(not)연산을 하면 된다...
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star10() {
        System.out.println("-----------star10--------------");
        for (int i = 0; i < 5; i++) {
            System.out.print(" ".repeat(4-i) + "*".repeat(2*i+1) + " ".repeat(4-i));
            System.out.println();
        }
    }
}



