class Solution {
    public String solution(int q, int r, String code) {
                StringBuilder answer = new StringBuilder();

        for (int i = 0; i * q + r < code.length(); i++) {
            answer.append(code.charAt(i * q + r));
        }

        return answer.toString();
    }
}