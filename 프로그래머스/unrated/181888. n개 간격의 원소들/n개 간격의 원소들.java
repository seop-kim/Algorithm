class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length / n;

        if (num_list.length % n != 0) {
            size = (num_list.length / n) + 1;
        }

        int[] answer = new int[size];
        int val = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[val];
            val += n;
        }

        return answer;
    }
}