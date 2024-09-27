import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(delete_list);
        for(int a : arr) {
            if (Arrays.binarySearch(delete_list, a) < 0) {
                answer.add(a);
            }
        }
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}