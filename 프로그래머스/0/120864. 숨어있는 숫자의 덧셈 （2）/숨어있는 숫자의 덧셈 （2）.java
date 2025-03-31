class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        s = s.replaceAll("\\s+", " ").strip();

        if (s.isEmpty()) return 0;

        String[] strArr = s.split(" ");

        for (String str : strArr) {
            if (!str.isBlank()) {
                answer += Integer.parseInt(str);
            }
        }

        return answer;
    }
}