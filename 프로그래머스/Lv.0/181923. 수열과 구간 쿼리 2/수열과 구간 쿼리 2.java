import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int temp = 0;
        for (int[] query : queries) {
            int length = query[1] - query[0] + 1;
            int[] codomain = new int[length];
            System.arraycopy(arr, query[0], codomain, 0, length);
            OptionalInt result = Arrays.stream(codomain)
                    .filter(i -> i > query[2])
                    .min();
            if (result.isPresent()) {
                answer[temp] = result.getAsInt();
            } else {
                answer[temp] = -1;
            }
            temp++;
        }

        return answer;
    }
}