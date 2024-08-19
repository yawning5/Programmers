class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    flag = false;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    flag = false;
                }
            }
            answer++;
        }
        return answer - 1;
    }
}