import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }

        Map<Character, int[]> map = new HashMap<>();

        map.put('E', new int[]{0, 1});
        map.put('W', new int[]{0, -1});
        map.put('S', new int[]{1, 0});
        map.put('N', new int[]{-1, 0});

        for (String route : routes) {
            char direction = route.charAt(0);
            int moveCount = route.charAt(2) - '0';

            int[] dxdy = map.get(direction);

            int dx = dxdy[0];
            int dy = dxdy[1];

            int curX = answer[0];
            int curY = answer[1];

            boolean isOk = true;

            for (int i = 0; i < moveCount; i++) {
                curX += dx;
                curY += dy;

                if (curX < 0 || curY < 0 || curX > park.length - 1 || curY > park[0].length() - 1) {
                    isOk = false;
                    break;
                }

                if (park[curX].charAt(curY) == 'X') {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                answer[0] = curX;
                answer[1] = curY;
            }
        }

        return answer;
    }
}