class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int value = k;
        int index = 0;
        
        while(value <= n){
            answer[index] = value;
            index++;
            value += k;
        }
        
        return answer;
    }
}