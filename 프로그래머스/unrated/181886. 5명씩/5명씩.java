class Solution {
    public String[] solution(String[] names) {
         if (names.length == 0) {
            return new String[0];
        }
        int namesLen = names.length; // 7
        int a = namesLen / 5; //1
        int b = namesLen % 5; // > 0

        if (b > 0) {
            b = 1;
        }

        int lenSize = a + b;

        String[] answer = new String[lenSize];

        int c = 0;

        for (int i = 0; i < answer.length - 1; i++) {  // 3 2
            answer[i] = names[c];
            c = c + 5; // 0 + 5
        } // nami

        //  answer.length  : 2   -  1  //
        if (b == 0) {
            answer[answer.length - 1] = names[a * 5 - 5]; // 1 * 5 == 5
            return answer;
        }
        answer[answer.length - 1] = names[a * 5]; // 1 * 5 == 5
        return answer;
    }
}