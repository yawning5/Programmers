class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        System.arraycopy(arr, 0, answer, 0 , arr.length);

        for (int[] task : queries) {
            answer[task[0]] = arr[task[1]];
            answer[task[1]] = arr[task[0]];
            System.arraycopy(answer, 0, arr, 0 , arr.length);
        }

        return answer;
    }
}