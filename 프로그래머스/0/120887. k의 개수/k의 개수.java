class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int s = i; s <= j; s++) {
            char[] cur = String.valueOf(s).toCharArray();
            for(char c : cur) {
                if(Character.getNumericValue(c) == k) answer++;
            }
        }
        return answer;
    }
}