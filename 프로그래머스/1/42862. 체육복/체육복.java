import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int k = 0;

        while (k < lost.length) {
            if (Arrays.binarySearch(reserve, lost[k]) >= 0) {
                answer++;
                reserve[Arrays.binarySearch(reserve, lost[k])] = -2;
                lost[k] = -5;
            }
            k++;
        }

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {

            if (Arrays.binarySearch(reserve, lost[i] - 1) >= 0) {
                answer++;
                reserve[Arrays.binarySearch(reserve, lost[i] - 1)] = -2;
                Arrays.sort(reserve);
            } else if (Arrays.binarySearch(reserve, lost[i] + 1) >= 0) {
                answer++;
                reserve[Arrays.binarySearch(reserve, lost[i] + 1)] = -2;
                Arrays.sort(reserve);
            }
        }

        return answer;
    }
}