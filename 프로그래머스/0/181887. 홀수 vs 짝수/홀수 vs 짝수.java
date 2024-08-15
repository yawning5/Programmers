class Solution {
    public int solution(int[] num_list) {
        int totalEven = 0;
        int totalOdd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                totalOdd += num_list[i];
            } else {
                totalEven += num_list[i];
            } 
        }
        
        return Math.max(totalOdd, totalEven);
    }
}