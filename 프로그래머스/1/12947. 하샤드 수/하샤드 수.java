class Solution {
    public boolean solution(int x) {
 		int sum = 0;
        int value = x;
		while (value > 0) {
			sum += value % 10;
			value /= 10;
		}

		return x % sum == 0 ? true : false;
    }
}