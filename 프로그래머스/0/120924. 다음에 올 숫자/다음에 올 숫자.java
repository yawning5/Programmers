class Solution {
    public int solution(int[] common) {
        int answer = 0;

        int diff = common[1] - common[0];

        int multi = 0;
        if (common[0] != 0) {
            multi = common[1] / common[0];
        }

        if (common[2] == common[1] + diff) {
            answer = common[common.length - 1] + diff;
        } else if (common[0] != 0 && common[2] == common[1] * multi) {
            answer = common[common.length - 1] * multi;
        }

        return answer;
    }
}