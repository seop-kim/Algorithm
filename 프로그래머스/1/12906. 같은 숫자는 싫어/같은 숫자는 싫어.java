import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int value : arr) {
            if (stack.isEmpty() || stack.peek() != value) {
                stack.push(value);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}