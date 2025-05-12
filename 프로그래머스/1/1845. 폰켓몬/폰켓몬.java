import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        Map<Integer, Integer> mon = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mon.containsKey(nums[i])) {
                mon.put(nums[i], mon.get(nums[i]) + 1);
            } else mon.put(nums[i], 1);
        }

        return Math.min(mon.size(), nums.length / 2);
    }
}