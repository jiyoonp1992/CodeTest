package Level1;

import java.util.Arrays;

public class level1_077_PCCE {
	//[PCCE 기출문제] 9번 / 이웃한 칸
	public static void main(String[] args) {
		String[][] str03 = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
		String[][] str01 = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
		System.out.println(solution(str03, 1, 1));
	}
	
	public static int solution(String[][] board, int h, int w) {
		int answer = 0;
		String color = "";
		color = board[h][w];
		if(0 <= w-1 && color.equals(board[h][w-1])) {
			answer++;
		};
		if(0 <= h-1 && color.equals(board[h-1][w])) {
			answer++;
		};
		if(board.length > w+1 && color.equals(board[h][w+1])) {
			answer++;
		};
		if(board.length > h+1 && color.equals(board[h+1][w])) {
			answer++;
		};
        return answer;
	}
}