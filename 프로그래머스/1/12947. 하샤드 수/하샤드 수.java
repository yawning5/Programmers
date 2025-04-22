class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int originalX = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return originalX % sum == 0 ? true : false;
    }
}