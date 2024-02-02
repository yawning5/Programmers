class Solution {
    public String solution(String s, String skip, int index) {
    StringBuilder answer = new StringBuilder();
        for (char a : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                a++;
                if (a > 'z') {
                    a = (char) ('a' + (a - 'z' - 1));
                }
                if (skip.indexOf(a) != -1) {
                    i--;
                }
            }
            answer.append(a);
        }
    return answer.toString();
    }
}