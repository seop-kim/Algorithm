class Solution {
    public String solution(String s, int n) {
		char[] charArr = s.toCharArray();
		String answer = "";

		for (int i = 0; i < charArr.length; i++) { // 띄어쓰기
			if (charArr[i] == 32) {
				answer += (char) charArr[i];
				continue;
			}
			if (65 <= charArr[i] && charArr[i] + n <= 90) { // 대문자
				answer += (char) (charArr[i] + n);

			} else if (97 <= charArr[i] && charArr[i] + n <= 122) { // 소문자
				answer += (char) (charArr[i] + n);

			} else {
				answer += (char) ((charArr[i] + n) - 26);
			}

		}

		return answer;
    }
}