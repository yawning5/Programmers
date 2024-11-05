class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] chArr = my_string.toCharArray();
        char origin = chArr[num1];
        chArr[num1] = chArr[num2];
        chArr[num2] = origin;
        return String.valueOf(chArr);
    }
}