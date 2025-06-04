import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sum = new HashSet<>();
        int answer = 0;
        for (int i = 1; i <= elements.length; i++) {
            for (int start = 0; start < elements.length; start++) {
                int temp = 0;
                for (int k = 0; k < i; k++) {
                    temp += elements[(start + k) % elements.length];
                }
                sum.add(temp);
            }
        }
        return sum.size();
    }
}