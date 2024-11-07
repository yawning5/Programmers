class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int iBin1 = Integer.parseInt(bin1, 2);
        int iBin2 = Integer.parseInt(bin2, 2);
        
        return Integer.toString(iBin1 + iBin2, 2);
    }
}