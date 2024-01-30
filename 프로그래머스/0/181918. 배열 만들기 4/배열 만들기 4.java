import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; ) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}