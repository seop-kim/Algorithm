class Solution {
    public int[] solution(int[] num_list, int n) {
        n -= 1;
        int[] answer = new int[num_list.length - n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n];
            n += 1;
        }

        return answer;
    }
}