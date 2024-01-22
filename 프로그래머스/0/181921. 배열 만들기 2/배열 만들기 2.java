import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num = l; num <= r; num++) {
            String numStr = String.valueOf(num);
            boolean isOnlyZeroAndFive = true;

            for (char ch : numStr.toCharArray()) {
                if (ch != '0' && ch != '5') {
                    isOnlyZeroAndFive = false;
                    break;
                }
            }

            if (isOnlyZeroAndFive) {
                resultList.add(num);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}