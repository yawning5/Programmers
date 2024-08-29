import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        List<String> answerparts = new ArrayList<>();
                                               
        for(String str : parts) {
            if(!str.isEmpty()) {
                answerparts.add(str);
            }
        }
        
        String[] answer = answerparts.toArray(new String[0]);                                              
        Arrays.sort(answer);
        
        return answer;
    }
}