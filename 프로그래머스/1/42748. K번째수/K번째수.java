import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;

        for (int[] com : commands) {
            int[] temp = new int[com[1] - com[0] + 1];
            System.arraycopy(array, com[0] - 1, temp, 0, com[1] - com[0] + 1);
            Arrays.sort(temp);
            answer[i] = temp[com[2] - 1];
            i++;
        }

        return answer;
    }
}