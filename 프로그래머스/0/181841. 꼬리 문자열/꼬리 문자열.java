import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
for (int i = 0; i < str_list.length; i++) {
    if(str_list[i].contains(ex)) {
        str_list[i] = "";
    }
}
        return Arrays.stream(str_list)
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}