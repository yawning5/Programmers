class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (char c : X.toCharArray()) countX[c - '0']++;
        for (char c : Y.toCharArray()) countY[c - '0']++;

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int pairCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < pairCount; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) return "-1";
        
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}