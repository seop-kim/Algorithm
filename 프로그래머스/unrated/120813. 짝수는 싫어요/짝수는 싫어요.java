class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2]; // n=15 : arr size :8 , 15/2 = 7 x 16 / 2 = 8 o

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 1) {
                answer[i / 2] = i;
            }
        }

        return answer;
    }
}