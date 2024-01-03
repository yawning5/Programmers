import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {


        int[] answer = new int[photo.length];

   
        HashMap<String, Integer> humanPoints = new HashMap<String, Integer>();

        for (int i = 0; i < name.length; i++) {
       
            humanPoints.put(name[i], yearning[i]);
        }


        for (int i = 0; i < photo.length; i++) {
            answer[i] = Arrays.stream(photo[i])
                    .map(n -> humanPoints.containsKey(n) ? humanPoints.get(n) : 0)
                    .mapToInt(Integer::intValue)
                    .sum();
        }


        return answer;
    }
}