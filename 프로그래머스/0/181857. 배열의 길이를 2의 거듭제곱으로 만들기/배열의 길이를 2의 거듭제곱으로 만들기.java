import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        int arrLength = answer.size();
        double isPowerOfTwo = Math.log(arrLength) / Math.log(2);

        while ((arrLength & (arrLength - 1)) != 0){
            answer.add(0);
            arrLength = answer.size();
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}