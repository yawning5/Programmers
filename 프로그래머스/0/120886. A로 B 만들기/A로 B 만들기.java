class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bfArr = before.toCharArray();
        char[] afArr = after.toCharArray();
        for(int i = 0; i < before.length(); i++) {
            for(int j = 0; j < after.length(); j++) {
                if(bfArr[i] == afArr[j]) {
                    afArr[j] = ' ';
                    break;
                }
            }
        }
        String result = new String(afArr).trim();
        return result.length() == 0 ? 1 : 0;
    }
}