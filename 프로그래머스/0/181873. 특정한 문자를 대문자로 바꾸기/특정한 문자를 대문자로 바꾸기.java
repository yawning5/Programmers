class Solution {
    public String solution(String my_string, String alp) {
        my_string = my_string.toLowerCase();
        char[] charArray = my_string.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == alp.charAt(0)) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
}