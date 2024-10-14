import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .map(i -> i < 'l' ? 'l' : i)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}