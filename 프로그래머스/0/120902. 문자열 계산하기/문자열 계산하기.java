class Solution {
    public int solution(String my_string) {
        
         String[] cal = my_string.split(" ");
        int answer = Integer.parseInt(cal[0]);
        for(int i = 1; i < cal.length; i += 2) {
            
        int a = Integer.parseInt(cal[i + 1]);
            if (cal[i].equals("+")) {
                answer += a;
            } else answer -= a;
            
        }
        return answer;
    }
}