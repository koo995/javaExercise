package src.exe6;

public class Q3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,0}};

        int[][] arr2 = new int[][]{
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,0}};

        int[][] arr3 = new int[][]{
                {1,1,0,1,1},
                {1,1,1,1,1},
                {0,1,1,0,1},
                {1,1,0,1,1},
                {1,1,1,1,1}};

        int result1 = bingoCount1(arr1);
        int result2 = bingoCount1(arr2);
        int result3 = bingoCount1(arr3);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }


    static int bingoCount1(int[][] arrs) {
        int count = 0;
        int cross1Count = 1;
        int cross2Count = 1;
        for (int i = 0; i < arrs.length; i++) {
            int horizonCount = 1;
            int verticalCount = 1;
            for (int j = 0; j < arrs[0].length; j++) {
                horizonCount *= arrs[i][j];
                verticalCount *= arrs[j][i];
                if (i == j) cross1Count *= arrs[j][i];
                if (i + j == 4) cross2Count *= arrs[j][i];
            }
            count += (horizonCount + verticalCount);
        }
        count += (cross1Count + cross2Count);
        return count;
    }
}
