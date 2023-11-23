class Solution {
    public int[] solution(int start_num, int end_num) {
        int count = 0;
        
        for(int i = start_num; i <= end_num; i++){
            count++;
        }
        
        int[] answer = new int[count];
        
        count = 0;
        
        for(int i = start_num; i <= end_num; i++){
            answer[count] = i;
            count++;
        }
        
        return answer;
    }
}