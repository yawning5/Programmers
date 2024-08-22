class Solution {
    public int solution(String myString, String pat) {
        String lowString = myString.toLowerCase();
        String lowPat = pat.toLowerCase();
        
        return lowString.indexOf(lowPat) == -1 ? 0 : 1;
    }
}