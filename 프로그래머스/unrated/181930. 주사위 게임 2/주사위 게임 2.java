class Solution {
    public int solution(int a, int b, int c) {
        int exponent = 1;
        int result = 1;

        if (a == b && b == c) {
            exponent++;
        }

        if (a == b || b == c || c == a) {
            exponent++;
        }

        for (int i = 1; i <= exponent; i++) {
            result *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }

        return result;
    }
}