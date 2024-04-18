class Solution {
    public String solution(int[] food) {
       String answer = "";
        int currentFood = 1;
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0 && food[i] > 1) {
                food[i] = food[i] - 1;
            }

            for (int j = 0; j < food[i]/2; j++) {
                answer += currentFood;
            }
            currentFood++;
        }

        answer += 0;
        currentFood--;

        for (int i = food.length-1; 0 < i; i--) {
            if (food[i] % 2 != 0 && food[i] > 1) {
                food[i] = food[i] - 1;
            }

            for (int j = 0; j < food[i]/2; j++) {
                answer += currentFood;
            }

            currentFood--;
        }
        
        return answer;
    }
}