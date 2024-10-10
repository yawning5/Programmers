import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for (String str : picture) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                sb.append(String.valueOf(str.charAt(j)).repeat(k));
            }

            for (int h = 0; h < k; h++) {
                answer.add(sb.toString());
            }
        }
        return answer.toArray(new String[0]);
    }
}