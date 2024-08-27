class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        while (my_string.contains("  ")) {
            my_string = my_string.replaceAll("  ", " ");
        }
        my_string = my_string.trim();

        return my_string.split(" ");
    }
}