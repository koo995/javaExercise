package src.exe1_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exe5 {

    public static void main(String[] args) {
        exe5_4();
        exe5_6();
        exe5_11();
    }

    static void exe5_4() {
        System.out.println("exe5.exe5_4");
        int[][] arr = {{5, 5, 5, 5, 5}, {10, 10, 10, 10, 10}, {20, 20, 20, 20, 20}, {30, 30, 30, 30, 30}};
        int total = 0;
        float average = 0;
        for (int[] sub_arr : arr) {
            int temp = 0;
            for (int i : sub_arr) {
                temp = temp + i;
            }
            total = total + temp;
            average = average + temp / sub_arr.length;
        }
        average = average / arr.length;
        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }

    static void exe5_6() {
        int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;
        System.out.println("money = " + money);
        for (int i = 0; i < coinUnit.length; i++) {
            int count = money / coinUnit[i];
            money = money % coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + count);
        }
    }

    static void exe5_11() {
        System.out.println("exe5.exe5_11");

        int[][] score = {
                {100, 100, 100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                result[score.length][j] += score[i][j];
                result[i][score[i].length] += score[i][j];
                result[score.length][score[i].length] += score[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
