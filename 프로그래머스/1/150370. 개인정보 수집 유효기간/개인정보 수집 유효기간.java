import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        today = today.replace(".", "");
        List<Integer> expired = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] data = privacies[i].split(" ");
            String expiryDate = calculateExpiryDate(data[0], termMap.get(data[1]));
            if (expiryDate.compareTo(today) < 0) {
                expired.add(i + 1);
            }
        }

        return expired.stream().mapToInt(i -> i).toArray();
    }

    private String calculateExpiryDate(String startDate, int monthsToAdd) {
        int year = Integer.parseInt(startDate.substring(0, 4));
        int month = Integer.parseInt(startDate.substring(5, 7));
        int day = Integer.parseInt(startDate.substring(8, 10));

        month += monthsToAdd;
        year += (month - 1) / 12;
        month = (month - 1) % 12 + 1;

        day = Math.min(day, 28);

        if (day == 1) {
            month--;
            if (month == 0) {
                month = 12;
                year--;
            }
            day = 28;
        } else {
            day--;
        }

        return String.format("%04d%02d%02d", year, month, day);
    }
}