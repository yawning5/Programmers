import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int end = numbers.length - 1;
        Arrays.sort(numbers);
        answer = Math.max(numbers[0] * numbers[1], numbers[end] * numbers[end - 1]);
        return answer;
    }
}