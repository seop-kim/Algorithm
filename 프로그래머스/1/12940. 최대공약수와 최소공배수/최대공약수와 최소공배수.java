class Solution {
    public int[] solution(int n, int m) {
        int min = 0;
        int max = 0;
        
        
            min = n;
            max = m;
        
        
        while(max != 0){
            int temp = min % max;
            min = max;
            max = temp;
        }
        
        
        int[] answer = {min, n * m / min};
        
        return answer;
    }
}