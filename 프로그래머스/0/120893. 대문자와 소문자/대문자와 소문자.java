class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] >= 'a' && charArr[i] <= 'z') {
                charArr[i] = Character.toUpperCase(charArr[i]);
            } else charArr[i] = Character.toLowerCase(charArr[i]);
        }
        return String.valueOf(charArr);
    }
}