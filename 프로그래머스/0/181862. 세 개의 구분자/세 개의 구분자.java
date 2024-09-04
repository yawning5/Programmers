class Solution {
    public String[] solution(String myStr) {
        String[] empty = {"EMPTY"};
        myStr = myStr.replace('a', ' ');
        myStr = myStr.replace('b', ' ');
        myStr = myStr.replace('c', ' ');
        while (myStr.contains("  ")){
        myStr = myStr.replaceAll("  ", " ");
        }
        myStr = myStr.trim();
        return myStr.isEmpty() ? empty : myStr.split(" ");
    }
}