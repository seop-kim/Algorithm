class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int last = num_list[size - 1];
        int nextLast = num_list[size - 2];
        int findNum = 0;

        if (last > nextLast) {
            findNum = last - nextLast;
        }

        if (last <= nextLast) {
            findNum = last * 2;
        }

        int[] answer = new int[size + 1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        answer[size] = findNum;
        return answer;
    }
}