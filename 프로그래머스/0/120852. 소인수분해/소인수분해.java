import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        int i = 2;
        
        while (n > 1) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        
        return set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}