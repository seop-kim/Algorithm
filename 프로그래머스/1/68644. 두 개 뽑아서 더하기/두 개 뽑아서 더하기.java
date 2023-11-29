import java.util.*;


class Solution {
	public int[] solution(int[] numbers) {
		ArrayList<Integer> arr = new ArrayList<>();

		int[] answer = {};
		int no = 0;

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				int result = numbers[i] + numbers[j]; // 값을 더한다.
				boolean check = true; // 값이 중복인지 확인하기 위함

				for (int k = 0; k < arr.size(); k++) { // 값 중복을 찾아낸다. 반복문이 계속 돌면 true 로 나간다.
					if (arr.get(k) == result) {
						check = false;
						break;

					} else {
						check = true;
					}
				}

				if (check) {
					arr.add(result);
					no++;
				}
			}
		}

		answer = new int[arr.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr.get(i);

		}

		Arrays.sort(answer);
		return answer;
    }
}