import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> daily = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            daily.add(score[i]);

            if (i < k) {
                answer[i] = daily.stream()
                        .min(Integer::compare)
                        .orElse(-1);
            } else {
                int[] dailyArr = daily.stream()
                        .sorted((a, b) -> b - a)
                        .mapToInt(Integer::intValue)
                        .toArray();
                answer[i] = dailyArr[k - 1];
            }
        }
        return answer;
    }
}