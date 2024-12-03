import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {

        Integer[] numArray = Arrays.stream(numlist)
                .boxed()
                .toArray(Integer[]::new);


        Arrays.sort(numArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int diffA = Math.abs(a - n);
                int diffB = Math.abs(b - n);
                
                if (diffA == diffB) {

                    return b - a;
                } else {

                    return diffA - diffB;
                }
            }
        });
        
        int[] answer = Arrays.stream(numArray)
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}