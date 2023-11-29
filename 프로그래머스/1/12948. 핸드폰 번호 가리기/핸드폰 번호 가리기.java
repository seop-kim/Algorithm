class Solution {
    public String solution(String phone_number) {
		String answer = phone_number;
		byte[] result = answer.getBytes();

		for (int i = 0; i < result.length - 4; i++) {
			result[i] = '*';
		}

		return new String(result);
	
    }
}