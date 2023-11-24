class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sub = 0;
        int multi = 1;

        for (int value : num_list) {
            sub += value;
            multi *= value;
        }
        
        if (sub * sub > multi) {
            answer = 1;
        }

        return answer;
    }
}