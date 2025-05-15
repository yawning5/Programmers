import java.util.*;
class Solution {
    public String solution(String s) {
        String[] index = s.split(" ");
        int[] nums = new int[index.length];
        
        for (int i = 0; i < index.length; i++) {
            nums[i] = Integer.parseInt(index[i]);
        }
        
        Arrays.sort(nums);
        return nums[0] + " " + nums[nums.length - 1];
    }
}