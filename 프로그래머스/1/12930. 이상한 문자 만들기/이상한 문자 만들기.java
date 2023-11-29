class Solution {
	public String solution(String s) {
		char[] answerArr = s.toCharArray();
		int count = 0;
		for (int i = 0; i < answerArr.length; i++) {
			if (answerArr[i] == ' ') {
				count = 0;
				continue;
			}

			if (count % 2 == 0) {
				answerArr[i] = Character.toUpperCase(answerArr[i]);
			} else {
				answerArr[i] = Character.toLowerCase(answerArr[i]);
			}
			count++;

		}
		return new String(answerArr);
	}
}