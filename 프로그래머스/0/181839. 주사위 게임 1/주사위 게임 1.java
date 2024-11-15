class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean a1 = true;
        boolean b1 = true;
        
        if(a % 2 == 0){
            a1 = false;
        }
        
        if(b % 2 == 0){
            b1 = false;
        }
        
        if(a1 && b1){
            answer += a  * a;
            answer += b * b;
            return answer;
        }
        
        if(a1 || b1){
            answer = a + b;
            answer *= 2;
            return answer;
        }
        
        if(a > b){
            return a - b;
        }
        
        return b - a;
    }
}