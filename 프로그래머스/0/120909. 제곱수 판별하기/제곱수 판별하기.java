import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        return (Math.sqrt(n) * 10) % 10 == 0 ? 1 : 2;
    }
}