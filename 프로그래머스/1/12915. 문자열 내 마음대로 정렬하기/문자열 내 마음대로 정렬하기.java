import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // List<String> list = new ArrayList(); 
        // for (String str : strings) {
        //     list.add(str);
        // }
        // list.sort((a, b) -> {
        //     char chA = a.charAt(n);
        //     char chB = b.charAt(n);
        //     int tmp = n;
        //     while(chA == chB) {
        //         tmp++;
        //         chA = a.charAt(tmp);
        //         chB = b.charAt(tmp);
        //     }
        //     return chA - chB;
        // });
        // String[] answer = list.toArray(new String[0]);
        // return answer;
        Arrays.sort(strings, (a, b) -> {
            int c = Character.compare(a.charAt(n), b.charAt(n));
            if (c != 0) return c;
            return a.compareTo(b);
        });
        return strings;
    }
}