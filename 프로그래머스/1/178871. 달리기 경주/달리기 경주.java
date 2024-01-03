import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        System.arraycopy(players, 0, answer, 0, players.length);

 
        Map<String, Integer> playerPositions = new HashMap<>();

  
        for (int i = 0; i < answer.length; i++) {
            // (플레이어 이름, 위치)
            playerPositions.put(answer[i], i);
        }


        for (String overTaker : callings) {
            int position = playerPositions.get(overTaker);
            if (position > 0) {
                String overTaken = answer[position - 1];
                answer[position] = overTaken;
                answer[position - 1] = overTaker;
                playerPositions.put(overTaken, position);
                playerPositions.put(overTaker, position - 1);
            }
        }

        return answer;
    }
}