class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open = 0;
        int close = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if(close > open) {return false;}
            if(s.charAt(i) == '(') {
                open++;
            } else {close++;}
        }

        return open == close ? true : false;
    }
}