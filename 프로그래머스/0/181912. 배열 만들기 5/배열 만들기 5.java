import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            int candidate = Integer.parseInt(intStr.substring(s, l + s));
            if (candidate > k) {
                answer.add(candidate);
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}