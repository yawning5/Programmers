class Solution {
    public String solution(String polynomial) {
        int[] cal = new int[2];

        polynomial = polynomial.replaceAll("\\+", "");
        polynomial = polynomial.replaceAll("\\s+", " ").trim();

        String[] terms = polynomial.split(" ");

        for (String term : terms) {
            if (term.contains("x")) {
                String num = term.replace("x", "");
                if (num.equals("")) num = "1";
                cal[0] += Integer.parseInt(num);
            } else {
                cal[1] += Integer.parseInt(term);
            }
        }
        
        StringBuilder answer = new StringBuilder();

        if (cal[0] != 0) {
            if (cal[0] == 1) {
                answer.append("x");
            } else answer.append(cal[0]).append("x");
        }

        if (cal[1] != 0) {
            if (cal[0] != 0) {
                answer.append(" + ");
            } answer.append(cal[1]);
        }
        
        return answer.toString();
    }
}