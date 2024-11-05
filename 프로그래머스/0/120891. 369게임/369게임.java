class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] charArr = String.valueOf(order).toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if((charArr[i] - '0') % 3 == 0 && (charArr[i] - '0') != 0) answer++;
        }
        return answer;
    }
}