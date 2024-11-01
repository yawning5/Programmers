class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String strNum = String.valueOf(num);
        String target = String.valueOf(k);
        return strNum.indexOf(target) + 1 == 0 ? -1 : strNum.indexOf(target) + 1;
    }
}