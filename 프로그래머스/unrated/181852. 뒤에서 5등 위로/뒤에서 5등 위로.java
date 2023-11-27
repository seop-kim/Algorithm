import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 정렬
        int[] answer = new int[num_list.length - 5];

        int index = 5;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[index];
            index++;
        }

        return answer;
    }
}