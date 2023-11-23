class Solution {
    public int solution(int slice, int n) {
                int answer = 0;

        while(true){
            if(n - slice < 0){
                answer++;
                break;
            }else if(n - slice == 0){
                answer++;
                break;
            }else{
                n = n - slice;
                answer++;
            }
        }
        return answer;
    }
}