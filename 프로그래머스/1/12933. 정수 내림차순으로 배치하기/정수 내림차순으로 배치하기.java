import java.util.*;

class Solution {
    public long solution(long n) {
        String answerStr = "";
        String str = n + "";
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        for (int i = charArray.length - 1; 0 <= i; i--) {
            answerStr += charArray[i];
        }

        return Long.parseLong(answerStr);
    }
}