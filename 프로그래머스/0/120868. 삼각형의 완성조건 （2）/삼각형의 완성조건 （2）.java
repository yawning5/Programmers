class Solution {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        int answer = min - 1 + min;
        return answer;
    }
}