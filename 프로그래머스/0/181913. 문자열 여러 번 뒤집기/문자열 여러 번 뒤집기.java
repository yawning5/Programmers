class Solution {
    public static String solution(String my_string, int[][] queries) {
        int end = my_string.length();
        StringBuilder progress = new StringBuilder(my_string);

        for (int[] A : queries) {
            StringBuilder result = new StringBuilder("");
            result.append(progress.substring(0, A[0]));
            result.append(reverse(progress.substring(A[0], A[1] + 1)));
            result.append(progress.substring(A[1] + 1, end));
            progress = result;
        }

        return progress.toString();
    }

    public static String reverse(String A) {
        StringBuilder result = new StringBuilder(A);
        return result.reverse().toString();
    }
}