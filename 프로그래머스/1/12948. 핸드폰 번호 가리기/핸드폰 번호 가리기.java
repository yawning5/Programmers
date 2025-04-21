class Solution {
    public String solution(String phone_number) {
        int l = phone_number.length();
        String lastnum = phone_number.substring(l - 4, l);
        String answer = "*".repeat(l - 4) + lastnum;
        return answer;
    }
}