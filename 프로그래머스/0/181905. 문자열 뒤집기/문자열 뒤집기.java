class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        
        StringBuilder answer = new StringBuilder(my_string);
        
        answer.replace(s, e + 1, sb.toString());
        
        return answer.toString();
    }
}