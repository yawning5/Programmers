class Solution {
    public int solution(int[][] lines) {
       
        int[] calLine = new int[201]; 

        for (int[] line : lines) {
            int start = line[0] + 100; 
            int end = line[1] + 100;   

            for (int i = start; i < end; i++) { 
                calLine[i]++;
            }
        }

        int answer = 0;
        for (int count : calLine) {
            if (count >= 2) {
                answer++;
            }
        }

        return answer;
    }
}