package src.exe6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {1, 1, 2};
        int[] arr3 = {1, 1, 1};
        int result = mid(arr);
        System.out.println("result = " + result);
        result = mid(arr1);
        System.out.println("result = " + result);
        result = mid(arr2);
        System.out.println("result = " + result);
        result = mid(arr3);
        System.out.println("result = " + result);

    }


    static int mid(int[] arr) {
//        return Arrays.stream(arr).sorted().toArray()[1];

        // 정렬말고는 어떤 방법이 있을까? 일단 값을 비교해야하지 않을까?
        // 비교를 어떤 식으로 해나갈까? 3번 비교하는 것이 아니면 다른 방법이 있을까?
        for (int i = 0; i < arr.length -1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] >= arr[j]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
        return arr[1];
    }

    static int mid2(int[] arr) {
        if ((arr[0] >= arr[1] && arr[0] <= arr[2]) || (arr[0] >= arr[2] && arr[0] <= arr[1])) {
            return arr[0];
        } else if ((arr[1] >= arr[2] && arr[1] <= arr[0]) || (arr[1] >= arr[0] && arr[1] <= arr[2])) {
            return arr[1];
        } else {
            return arr[2];
        }
    }

}
