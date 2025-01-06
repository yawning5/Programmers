class Solution {
    public String solution(int age) {
        String answer = "";
        char[] lang = String.valueOf(age).toCharArray();

        for (int i = 0; i < lang.length; i++) {
            answer += (char) (lang[i] + 49);
        }

        return answer;
    }
}