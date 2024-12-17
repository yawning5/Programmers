class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int index = 0;
        int[] possAngle = new int[6];
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                possAngle[index] = ((dots[i][0]*100 - dots[j][0]*100)) / (dots [i][1] - dots[j][1]);
            index++;
            }
        }

        for (int i = 0; i < 2; i++) {
            if (possAngle[i] == possAngle[possAngle.length - i - 1]) {
                return 1;
            }
        }
        
        return answer;
    }
}