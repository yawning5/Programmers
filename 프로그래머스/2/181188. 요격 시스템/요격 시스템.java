import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(arr -> arr[1]));

        int answer = 0;
        int end = -1; 

        for (int[] target : targets) {
 
            if (target[0] >= end) {
                answer++; 
                end = target[1]; 
            }
        }

        return answer;
    }
}