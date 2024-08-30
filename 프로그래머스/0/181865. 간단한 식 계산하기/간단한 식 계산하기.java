class Solution {
    public int solution(String binomial) {

        int answer = 0;

        String[] math = binomial.split(" ");

        switch (math[1]) {
            case "+":
                answer = Integer.parseInt(math[0]) + Integer.parseInt(math[2]);
                break;
            case "-":
                answer = Integer.parseInt(math[0]) - Integer.parseInt(math[2]);
                break;
            case "*":
                answer = Integer.parseInt(math[0]) * Integer.parseInt(math[2]);
                break;
        }

        return answer;
    }
}