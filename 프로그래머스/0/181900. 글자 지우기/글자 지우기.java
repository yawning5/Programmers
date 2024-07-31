class Solution {
    public String solution(String my_string, int[] indices) {
        char[] progress = my_string.toCharArray();
        for (int i : indices) {
            progress[i] = ' ';
        }
        
        String answer = String.valueOf(progress);

        return answer.replaceAll(" ", "");
    }
}