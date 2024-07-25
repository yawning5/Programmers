class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = 0; c + i * m - 1 < my_string.length(); i++) {
            answer += my_string.charAt(c + i * m - 1);
        }

        return answer;
    }
}