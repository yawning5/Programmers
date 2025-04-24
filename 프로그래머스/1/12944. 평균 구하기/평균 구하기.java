class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            double temp = arr[i];
            answer += temp;
        }
        return answer / arr.length;
    }
}