import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = 0;
        int[] no = new int[1];
        no[0] = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }

        for (int i = start; i <= end; i++) {
            answer.add(arr[i]);
        }

        if (answer.contains(2)) {
            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else return no;
    }
}