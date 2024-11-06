import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int idx = Arrays.stream(array)
            .map(i -> Math.abs(n - i))
            .min()
            .orElse(-1);
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n)==idx) {
                answer = array[i];
                break;}
        }
        return answer;
    }
}