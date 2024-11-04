import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        int[] idx = new int[300];
        s.chars()
            .forEach(i -> idx[i]++);
        String answer = s.chars()
            .filter(i -> idx[i] == 1)
            .mapToObj(i -> String.valueOf((char) i))
            .sorted()
            .collect(Collectors.joining());
        return answer;
    }
}