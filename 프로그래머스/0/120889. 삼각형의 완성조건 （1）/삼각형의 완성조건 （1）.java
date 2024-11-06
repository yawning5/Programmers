class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < sides.length; i++) {
            max = max < sides[i] ? sides[i] : max;
            sum += sides[i];
        }
        return sum - max > max ? 1 : 2;
    }
}