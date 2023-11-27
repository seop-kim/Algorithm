import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> pickArr = new ArrayList<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (pickArr.size() != 0 && pickArr.get(pickArr.size() - 1) == (board[j][moves[i] - 1])) {
						answer += 2;
						pickArr.remove(pickArr.size() - 1);
						board[j][moves[i] - 1] = 0;
						break;

					} else {
						pickArr.add(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
						break;
					}
				}
			}
		}
		return answer;
    }
}