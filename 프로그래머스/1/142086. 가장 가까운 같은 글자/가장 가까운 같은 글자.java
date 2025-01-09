class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(0, i);
            answer[i] = substring.lastIndexOf(s.charAt(i));
            if (substring.lastIndexOf(s.charAt(i)) != -1) {
                int length = substring.lastIndexOf(s.charAt(i));
                answer[i] = i - substring.lastIndexOf(s.charAt(i));
            }
        }
        return answer;
    }
}