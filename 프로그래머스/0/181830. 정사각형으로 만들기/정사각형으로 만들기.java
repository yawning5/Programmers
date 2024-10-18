import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length > arr[0].length) {
           for (int i = 0; i < arr.length; i++) {
                arr[i] = Arrays.copyOf(arr[i], arr.length);
            }
        } else if (arr.length < arr[0].length) {
            int originalLength = arr.length;
            arr = Arrays.copyOf(arr, arr[0].length);

            for (int i = originalLength; i < arr.length; i++) {
                arr[i] = new int[arr[0].length];
            }
        }
        return arr;
    }
}