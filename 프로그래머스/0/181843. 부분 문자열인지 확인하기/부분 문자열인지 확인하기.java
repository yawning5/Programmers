class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        return my_string.indexOf(target) >= 0 ? 1 : 0;
    }
}