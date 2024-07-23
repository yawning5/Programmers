import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= my_string.length(); i++) {
            answer.add(my_string.substring(my_string.length() - i));
        }
        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }
}