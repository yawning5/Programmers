import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList();
        int cnt = 0;

        for (char a : myString.toCharArray()) {
            if (a == 'x') {
                answer.add(cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }

        if (cnt > 0) {
            answer.add(cnt);
        } else if (myString.charAt(myString.length() - 1) == 'x') {
            answer.add(0);
        }


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}