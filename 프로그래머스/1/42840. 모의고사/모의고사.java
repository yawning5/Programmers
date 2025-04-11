import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int highScore = 0;
        List<Integer> highScoreList = new ArrayList<>();
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        Map<Integer, Integer> score = new HashMap<>();
        score.put(1, 0);
        score.put(2, 0);
        score.put(3, 0);
        int temp = 0;

        for (int i : answers) {
            if (i == one[temp % 5]) score.put(1, score.get(1) + 1);
            if (i == two[temp % 8]) score.put(2, score.get(2) + 1);
            if (i == three[temp% 10]) score.put(3, score.get(3) + 1);
            temp++;
        }

        for (int i = 1; i < 4; i++) {
            highScore = Math.max(score.get(i), highScore);
        }

        for (int i = 1; i < 4; i++) {
            if (score.get(i) == highScore) {
                highScoreList.add(i);
            }
        }

        int[] answer = highScoreList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(answer);

        return answer;
    }
}