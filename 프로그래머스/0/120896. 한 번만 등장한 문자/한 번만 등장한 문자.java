import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c),0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer.append(key);
            }
        }
        char[] charArray = answer.toString().toCharArray();
        Arrays.sort(charArray);
        answer = new StringBuilder(new String(charArray));
        return answer.toString();
    }
}