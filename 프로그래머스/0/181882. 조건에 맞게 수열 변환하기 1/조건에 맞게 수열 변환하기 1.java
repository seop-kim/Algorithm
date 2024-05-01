class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = checkNum(arr[i]);
        }
        return answer;
    }
    
    private int checkNum(int number){
        if(number >= 50 && number % 2 == 0){
            return number / 2;
        }
        
        if(50 > number && number % 2 == 1){
            return number * 2;
        }
        
        return number;
    }
}