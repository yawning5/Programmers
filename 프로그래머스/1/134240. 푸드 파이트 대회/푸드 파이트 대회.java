class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; 
            left.append(String.valueOf(i).repeat(count));
        }

        String right = new StringBuilder(left).reverse().toString();

        return left + "0" + right;
    }
}