class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        return (int) (((num1 + 0.0001 - 0.0001) / (num2 + 0.0001 - 0.0001)) * 1000);
    }
}