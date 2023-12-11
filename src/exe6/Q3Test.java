package src.exe6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static src.exe6.Q3.bingoCount1;

class Q3Test {

    @Test
    void 빙고테스트() {
        int[][] arr1 = new int[][]{
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,0}};
        int result1 = bingoCount1(arr1);
        assertEquals(4, result1);

        int[][] arr2 = new int[][]{
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,1},
                {1,0,0,1,1},
                {1,1,1,1,0}};
        int result2 = bingoCount1(arr2);
        assertEquals(4, result2);

        int[][] arr3 = new int[][]{
                {1,1,0,1,1},
                {1,1,1,1,1},
                {0,1,1,0,1},
                {1,1,0,1,1},
                {1,1,1,1,1}};
        int result3 = bingoCount1(arr3);
        assertEquals(6, result3);

        int[][] arr4 = new int[][]{
                {1,1,0,1,1},
                {1,1,1,1,1},
                {0,1,0,0,0},
                {1,1,0,1,1},
                {1,1,1,1,1}};
        int result4 = bingoCount1(arr4);
        assertEquals(3, result4);

        int[][] arr5 = new int[][]{
                {1,1,0,1,1},
                {0,1,1,1,1},
                {0,0,1,0,0},
                {0,1,0,1,1},
                {1,1,0,1,1}};
        int result5 = bingoCount1(arr5);
        assertEquals(2, result5);
    }
}