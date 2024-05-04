class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long start = a;
        long end = b;
        
        if(start > end){
            start = b;
            end = a;
        }
        
        for(long i = start; i <= end; i++){
            answer += i;
        }
        
        return answer;
    }
}