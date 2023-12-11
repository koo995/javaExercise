package src.exe6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static src.exe6.Q2.mid;
import static src.exe6.Q2.mid2;

class Q2Test {

    @Test
    public void 중간값테스트() throws Exception {
        int[] arr = {1, 2, 3};
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {1, 1, 2};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {10, 13, 1};
        int result = mid2(arr);
        int result1 = mid2(arr1);
        int result2 = mid2(arr2);
        int result3 = mid2(arr3);
        int result4 = mid2(arr4);

        Assertions.assertTrue(result == 2);
        Assertions.assertTrue(result1 == 2);
        Assertions.assertTrue(result2 == 1);
        Assertions.assertTrue(result3 == 1);
        Assertions.assertTrue(result4 == 10);

    }

}