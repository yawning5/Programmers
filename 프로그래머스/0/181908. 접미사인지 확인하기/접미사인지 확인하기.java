import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> suffixes = new ArrayList<>();

        for (int i = 1; i <= my_string.length(); i++) {
            suffixes.add(my_string.substring(my_string.length() - i));
        }

        return suffixes.contains(is_suffix) ? 1 : 0;
    }
}