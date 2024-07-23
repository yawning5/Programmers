class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        answer.append(my_string, my_string.length() - n, my_string.length());
        
        return answer.toString();
    }
}