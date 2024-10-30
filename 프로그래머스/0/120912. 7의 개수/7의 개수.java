class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array) {
            for(char ch : String.valueOf(i).toCharArray()){
                if(ch == '7') answer ++;
            }
        }
        return answer;
    }
}