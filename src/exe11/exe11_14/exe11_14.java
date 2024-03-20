package src.exe11.exe11_14;


import java.util.ArrayList;
import java.util.Scanner;

public class exe11_14 {

    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            switch (displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }

        }
    }

    private static int displayMenu() {

        System.out.println("***********************************");
        System.out.println("*         성정 관리 프로그램           *");
        System.out.println("***********************************");
        System.out.println();
        System.out.println(" 1. 학생성적 입력하기");
        System.out.println();
        System.out.println(" 2. 학생성적 보기");
        System.out.println();
        System.out.println(" 3. 프로그램 종료");
        System.out.println();
        System.out.println("원하는 메뉴를 선택하세요. (1~3) : ");
        int menu = 0;

        while (menu == 0) {
            Integer input = Integer.parseInt(s.nextLine());
            if (!(1 <= input && input <= 3)) {
                System.out.println("메뉴의 선택이 잘못되었습니다.");
                System.out.println("원하는 메뉴를 선택하세요. (1~3) : ");
                continue;
            }
            menu = input;
        }
        return menu;
    }

    private static void inputRecord() {
        System.out.println("1. 학생성적 입력하기");
        System.out.println("이름, 반, 번호, 국어성적, 영어성적, 수학성적의 순서로 공백없이 입력하세요");
        System.out.println("입력을 마치려면 q를 입력하세요. 메인 화면으로 돌아갑니다.");
        System.out.println(">>");
        String input = "";
        while (!input.equals("q")) {
            input = s.nextLine();
            try {
                String[] Arr = input.split(",");
                record.add(new Student(Arr[0],
                        Integer.parseInt(Arr[1]),
                        Integer.parseInt(Arr[2]),
                        Integer.parseInt(Arr[3]),
                        Integer.parseInt(Arr[4]),
                        Integer.parseInt(Arr[5])));
                System.out.println("잘 입력되었습니다. 입력을 마치려면 q를 입력하세요");
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
                System.out.println("이름, 반, 번호, 국어성적, 영어성적, 수학성적의 순서로 공백없이 입력하세요");
            }
        }
    }

    private static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;

        int length = record.size();

        if (length > 0) {
            System.out.println();
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
            System.out.println("***********************************");
            for (int i = 0; i < length; i++) {
                Student student = (Student) record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                englishTotal += student.eng;
                mathTotal += student.math;
                total += student.total;
            }
            System.out.println("***********************************");
            System.out.println("총점: " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
            System.out.println();
        } else {
            System.out.println("데이터가 없습니다.");
            System.out.println("***********************************");
        }

    }


}
