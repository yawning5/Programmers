import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> bucket = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            bucket.put(want[i], number[i]);
        }

        for (int j = 0; j < 10; j++) {
            if (bucket.get(discount[j]) != null) {
                bucket.compute(discount[j],(k, v) -> v - 1);
            }
        }
        if (check(bucket)) {
            answer++;
        }

        for (int i = 1; i + 9 < discount.length; i++) {
            if (bucket.get(discount[i - 1]) != null) {
                bucket.compute(discount[i - 1], (k, v) -> v + 1);
            }
            if (bucket.get(discount[i + 9]) != null) {
                bucket.compute(discount[i + 9], (k, v) -> v - 1);
            }
            if (check(bucket)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean check(Map<String, Integer> bucket) {
        return bucket.values()
                .stream()
                .allMatch(v -> v <= 0);
    }
}