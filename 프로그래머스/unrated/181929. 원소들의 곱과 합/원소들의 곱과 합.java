import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        double all_multi = Arrays.stream(num_list)
                .reduce(1, (a, b) -> a * b);

        double sum_pow = Arrays.stream(num_list)
                .sum();

       return Math.pow(sum_pow, 2) > all_multi ? 1 : 0;
    }
}