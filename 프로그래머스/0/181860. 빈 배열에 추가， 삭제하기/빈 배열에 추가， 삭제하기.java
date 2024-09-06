import java.util.*;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> isTrue = new ArrayList<>();
        int startIndex = 0;

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                isTrue.addAll(Collections.nCopies(arr[i] * 2, arr[i]));
            } else {
                for (int r = 1; r <= arr[i]; r++) {
                    isTrue.remove(isTrue.size() - 1);
                }
            }
        }

        return isTrue.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}