import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        Arrays.sort(num_list);
        
        return Arrays.binarySearch(num_list, n) < 0 ? 0 : 1;
    }
}