import java.util.*;


class Solution {
    public int solution(String[] order) {
        int answer = 0;

        Map<String, Integer> menu = new HashMap<>();

        menu.put("iceamericano", 4500);
        menu.put("americanoice", 4500);
        menu.put("anything", 4500);
        menu.put("americano", 4500);
        menu.put("americanohot", 4500);
        menu.put("hotamericano", 4500);
        menu.put("icecafelatte", 5000);
        menu.put("cafelatteice", 5000);
        menu.put("cafelatte", 5000);
        menu.put("hotcafelatte", 5000);
        menu.put("cafelattehot", 5000);

        for (String str : order) {
            answer += menu.get(str);
        }

        return answer;
    }
}