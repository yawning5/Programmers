import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length]; 
        Double[] avg = new Double[score.length];
        int n = score[0].length;

        for (int i = 0; i < score.length; i++) {
            avg[i] = (double) ((score[i][0] + score[i][1]) / 2.0);
        }

        List<Double> list = new ArrayList<>(Arrays.asList(avg));
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(avg[i]) + 1;
        }
        
        return answer;
    }
}