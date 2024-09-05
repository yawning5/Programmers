import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int index = 0;

        for (int i : arr) {
            for (int r = 1; r <= i; r++) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}