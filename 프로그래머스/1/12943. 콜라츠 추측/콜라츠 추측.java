class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        if (num == 1) {
            return answer;}
        while (answer <= 500 && n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {n = n * 3 + 1;}
            answer++;
        } 
        return n == 1 ? answer : -1;
    }
}