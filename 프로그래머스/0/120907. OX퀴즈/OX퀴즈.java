class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] cal = quiz[i].split(" ");
            switch (cal[1]) {
                case "-":
                    answer[i] = Integer.parseInt(cal[0]) - Integer.parseInt(cal[2]) == Integer.parseInt(cal[4]) ? "O" : "X";
                    break;
                case "+":
                    answer[i] = Integer.parseInt(cal[0]) + Integer.parseInt(cal[2]) == Integer.parseInt(cal[4]) ? "O" : "X";
                    break;
            }

        }
        return answer;
    }
}