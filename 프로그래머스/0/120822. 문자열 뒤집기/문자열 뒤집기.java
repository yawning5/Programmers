class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] reverse = my_string.toCharArray();
        for (int i = 0; i < reverse.length; i++) {
            answer += String.valueOf(reverse[reverse.length - 1 - i]);
        }
        return answer;
    }
}