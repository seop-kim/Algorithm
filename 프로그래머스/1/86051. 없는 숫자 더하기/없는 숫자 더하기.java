class Solution {
    public int solution(int[] numbers) {
		int answer = 0;
		int[] checkNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < checkNum.length; j++) {
				if (checkNum[j] == numbers[i]) {
					checkNum[j] = 0;
				}
			}
		}

		for (int i = 0; i < checkNum.length; i++) {
			answer += checkNum[i];
		}

		return answer;
    }
}