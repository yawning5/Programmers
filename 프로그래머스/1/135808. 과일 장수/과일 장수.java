import java.util.Arrays;

import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        score = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = m - 1; i < score.length; i += m) {
            answer += score[i] * m;
        }


        return answer;
    }
}