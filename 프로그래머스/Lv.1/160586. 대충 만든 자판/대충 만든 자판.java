import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();
        
        for (String s : keymap) {
            for (int j = 0; j < s.length(); j++) {
                char cur = s.charAt(j);
                if (keypad.containsKey(cur)) {
                    int idx = keypad.get(cur);
                    keypad.put(cur, Math.min(idx, j + 1));
                } else {
                    keypad.put(cur, j + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for (char cur : target.toCharArray()) {
                if (keypad.containsKey(cur)) {
                    count += keypad.get(cur);
                } else {
                    flag = false;
                    break;
                }
            }
            answer[i] = !flag ? -1 : count;
        }
        return answer;
    }
}