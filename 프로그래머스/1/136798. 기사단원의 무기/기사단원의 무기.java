public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = getDivisorsCount(i); 

            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }

        return answer;
    }

    private int getDivisorsCount(int num) {
        int count = 0;
        for (int j = 1; j * j <= num; j++) {
            if (num % j == 0) {
                count++; 
                if (j != num / j) {
                    count++; 
                }
            }
        }
        return count;
    }
}