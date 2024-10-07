class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int date1Year = date1[0];
        int date2Year = date2[0];
        int date1Month = date1[1];
        int date2Month = date2[1];
        int date1Day = date1[2];
        int date2Day = date2[2];
        if (date1Year != date2Year) {
            return date1Year > date2Year ? 0 : 1;
        } else if (date1Month != date2Month) {
            return date1Month > date2Month ? 0 : 1;
        } else return date1Day >= date2Day ? 0 : 1;
    }
}