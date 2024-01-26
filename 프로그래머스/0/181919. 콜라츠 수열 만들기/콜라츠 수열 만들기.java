import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> progress = new ArrayList<>();

        for (int i = n; i >= 1; ) {
            progress.add(i);
            if (i == 1) {
                break;
            } else if (i % 2 == 1) {
                i = i * 3 + 1;
            } else if (i % 2 == 0) {
                i /= 2;
            }
        }

        return progress.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}