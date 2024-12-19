class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() == spell.length) {
                for (int j = 0; j < spell.length; j++) {
                    if (dic[i].contains(spell[j])) {
                        count++;
                    } else count = 0;
                    
                    if (count == spell.length) {
                        return 1;
                    }
                }
            }
        }
        return 2;
    }
}