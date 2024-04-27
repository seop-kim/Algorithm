class Solution {
    public int[] solution(int n, int m) {
        int min = 0;
        int max = 0;
        
        if (n > m){
            min = n;
            max = m;
        }else{
            min = m;
            max = n;
        }
        
        while(max != 0){
            int temp = min % max;
            min = max;
            max = temp;
        }
        
        
        int[] answer = {min, n * m / min};
        
        return answer;
    }
}