class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            if(charArray[i] == 'A') {
                charArray[i] = 'B';
            } else if (charArray[i] == 'B') {
                charArray[i] = 'A';
            }
        }

        return String.valueOf(charArray).contains(pat) ? 1 : 0;
    }
}