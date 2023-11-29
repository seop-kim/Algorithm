class Solution {
    public int solution(int left, int right) {
		int answer = 0;
		int qe;
		int[] arr = new int[right - left + 1];

		for (int i = 0; i < arr.length; i++) { 
			arr[i] = left + i;
			qe = 1;

			for (int j = 1; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					qe++; 
				}
			}

			if (qe % 2 == 0) {
				answer += arr[i];
			} else {
				answer -= arr[i];
			}
		}
		return answer;
    }
}