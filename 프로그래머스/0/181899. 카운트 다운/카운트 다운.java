import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> countdown = new ArrayList<>();

        for (int i = 0; i <= start_num - end_num; i++) {
            countdown.add(start_num - i);
        }

        return countdown.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}