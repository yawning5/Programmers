import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] index  = new int[31];
        
        for (String str : strArr) {
            index[str.length()]++;
        }
        
        return IntStream.of(index).max().orElse(0);
    }
}