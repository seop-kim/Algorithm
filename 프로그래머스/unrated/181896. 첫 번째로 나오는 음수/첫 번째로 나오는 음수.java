class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        // TODO : 기능 구현
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}