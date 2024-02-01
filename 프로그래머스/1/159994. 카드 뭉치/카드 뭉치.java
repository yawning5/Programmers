import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> deck1 = new LinkedList<>();
        Queue<String> deck2 = new LinkedList<>();

        Arrays.stream(cards1)
                .forEach(i -> deck1.offer(i));
        Arrays.stream(cards2)
                .forEach(i -> deck2.offer(i));

        for (String word : goal) {
            if (word.equals(deck1.peek())) {
                deck1.poll();
            } else if (word.equals(deck2.peek())) {
                deck2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}