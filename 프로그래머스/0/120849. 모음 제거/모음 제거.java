class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String blackList = "aeiou";
        for(char c : my_string.toCharArray()) {
            if (blackList.indexOf(c) == -1)
            {answer.append(c);}
        }
        return answer.toString();
    }
}