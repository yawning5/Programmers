class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] check = new char[200];
        char[] charArr = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++) {
            if(check[charArr[i]] == 0) {
                answer.append(charArr[i]);
            }
            check[charArr[i]]++;
            
        }
        return answer.toString();
    }
}