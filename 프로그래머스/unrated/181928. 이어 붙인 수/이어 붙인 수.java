import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] odd_num = Arrays.stream(num_list)
                .filter(n -> n % 2 == 1)
                .toArray();
        int[] even_num = Arrays.stream(num_list)
                .filter(n -> n % 2 == 0)
                .toArray();

        answer = multiple(odd_num) + multiple(even_num);

        System.out.println(answer);

        return answer;
    }

    public int multiple(int[] numList) {

        int result = 0;

        for (int i = numList.length - 1; i >= 0; i--) {
            result += numList[i] * Math.pow(10, numList.length - i - 1);
        }
        return result;
    }
}