import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
		String[] arr = s.split("");
		String answer = "";
		Arrays.sort(arr, Collections.reverseOrder());
		for (String data : arr)
			answer += data;
		return answer;
    }
}