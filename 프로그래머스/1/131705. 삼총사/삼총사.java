class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                int k = j + 1;
                while (k < number.length) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                    k++;
                }
            }
        }

        return answer;
    }
}