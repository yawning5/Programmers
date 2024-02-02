class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] counts = new int[7];
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 4) {
                return 1111 * i;
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (j != i && counts[j] == 1) {
                        return (10 * i + j) * (10 * i + j);
                    }
                }
            }
        }

        int pair1 = -1, pair2 = -1;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                if (pair1 == -1) pair1 = i;
                else pair2 = i;
            }
        }
        if (pair1 != -1 && pair2 != -1) {
            return (pair1 + pair2) * Math.abs(pair1 - pair2);
        }
        
        int single1 = -1, single2 = -1;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                for (int j = 1; j <= 6; j++) {
                    if (counts[j] == 1) {
                        if (single1 == -1) single1 = j;
                        else single2 = j;
                    }
                }
                return single1 * single2;
            }
        }
        
        
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 1) {
                return i;
            }
        }
        
        return 0;
    }
}