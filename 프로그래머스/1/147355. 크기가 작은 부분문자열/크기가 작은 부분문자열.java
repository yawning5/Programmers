class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long intP = Long.parseLong(p);
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            Long three = Long.parseLong(t.substring(i, i + p.length()));
            if (three <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}