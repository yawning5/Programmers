import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {0, 0, 0, 0};

        List<Integer> allX = new ArrayList<>();
        List<Integer> allY = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                allY.add(i);
                allX.add(wallpaper[i].indexOf("#"));
                allX.add(wallpaper[i].lastIndexOf("#"));
            }
        }
        answer[0] = allY.stream()
                .min(Integer::compareTo)
                .orElse(0);

        answer[2] = allY.stream()
                .max(Integer::compareTo)
                .orElse(0) + 1;

        answer[1] = allX.stream()
                .min(Integer::compareTo)
                .orElse(0);

        answer[3] = allX.stream()
                .max(Integer::compareTo)
                .orElse(0) + 1;

        return answer;
    }
}