class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr  = s.toLowerCase().split(" ", -1);
        
        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i].length() > 0){
            sArr[i] = sArr[i].substring(0,1).toUpperCase() + sArr[i].substring(1);
        }
        }
        
        answer = String.join(" ", sArr);
        
        return answer;
    }
}