import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> dbMap= new HashMap<>();
        for(int i = 0; i < db.length; i++) {
            dbMap.put(db[i][0], db[i][1]);
        }
        if(dbMap.containsKey(id_pw[0])) {
            return id_pw[1].equals(dbMap.get(id_pw[0])) ? "login" : "wrong pw";
        }
        return "fail";
    }
}