import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
		int[] answer;
		boolean check = false;
		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		int[] arrClone = arr.clone();
		Arrays.sort(arrClone);
		answer = new int[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arrClone[0]) {
				check = true;
				continue;
			}

			if (check) {
				answer[i - 1] = arr[i];
			} else {
				answer[i] = arr[i];
			}
		}

		return answer;
    }
}