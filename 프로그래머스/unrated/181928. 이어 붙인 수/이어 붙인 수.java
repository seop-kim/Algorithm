class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder comp = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                comp.append(num);
                continue;
            }
            odd.append(num);
        }
        return Integer.parseInt(odd.toString()) + Integer.parseInt(comp.toString());
    }
}