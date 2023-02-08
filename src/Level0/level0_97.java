package Level0;

import java.util.Arrays;

public class level0_97 {
	//안전지대
	public static void main(String[] args) {
		//int[][] num01 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		//int[][] num01 = {{0, 0, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 1, 0, 0, 0}};
		//int[][] num01 = {{0}};
		//int[][] num01 = {{1}};
		int[][] num01 = {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}};
		int[][] num02 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
		int[][] num03 = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
		System.out.println(solution(num01));
		//System.out.println(solution(num02));
		//System.out.println(solution(num03));
	}
	
	public static int solution(int[][] board) {
        int answer = 0;
		boolean check = false;
		check = board.length == board[0].length && 1 <= board.length && board.length <= 100;
		if(check) {
			if(board.length == 1) {
				answer = board[0][0] == 1 ? answer:answer + 1;
			} else {
				for(int i = 0; i < board.length; i++) {
					for(int j = 0; j < board.length; j++) {
						if(i == 0) {
							if(j == 0) {
								answer = board[i][j] == 1 || board[i][j+1] == 1 || board[i + 1][j] == 1 || board[i + 1][j + 1] == 1 ?answer:answer + 1; 
							} else if (j == board[0].length - 1) {
								answer = board[i][j] == 1 || board[i][j-1] == 1 || board[i + 1][j] == 1 || board[i + 1][j - 1] == 1 ?answer:answer + 1;
							} else {
								answer = board[i][j - 1] == 1 || board[i][j] == 1 || board[i][j + 1] == 1 || board[i + 1][j - 1] == 1 || board[i + 1][j] == 1 || board[i + 1][j + 1] == 1 ? answer:answer + 1;
							}
						} else if (i == board.length - 1) {
							if(j == 0) {
								answer = board[i - 1][j] == 1 || board[i - 1][j+1] == 1 || board[i][j] == 1 || board[i][j + 1] == 1 ?answer:answer + 1; 
							} else if (j == board[0].length - 1) {
								answer = board[i][j] == 1 || board[i][j-1] == 1 || board[i - 1][j] == 1 || board[i - 1][j - 1] == 1 ?answer:answer + 1;
							} else {
								answer = board[i - 1][j - 1] == 1 || board[i - 1][j] == 1 || board[i - 1][j + 1] == 1 || board[i][j - 1] == 1 || board[i][j] == 1 || board[i][j + 1] == 1 ? answer:answer + 1;
							}
						} else if (j == 0) {
							answer = board[i - 1][j] == 1 || board[i][j] == 1 || board[i + 1][j] == 1 || board[i - 1][j + 1] == 1 || board[i][j + 1] == 1 || board[i + 1][j + 1] == 1 ? answer:answer + 1;
						} else if (j == board[0].length - 1) {
							answer = board[i- 1 ][j - 1] == 1 || board[i - 1][j] == 1 || board[i][j - 1] == 1 || board[i][j] == 1 || board[i + 1][j - 1] == 1 || board[i + 1][j] == 1? answer:answer + 1;
						} else {
							answer = board[i - 1][j - 1] == 1 || board[i - 1][j] == 1 || board[i - 1][j + 1] == 1 || board[i][j - 1] == 1 || board[i][j] == 1 || board[i][j + 1] == 1
									|| board[i + 1][j - 1] == 1 || board[i + 1][j] == 1 || board[i + 1][j + 1] == 1 || board[i][j + 1] == 1? answer:answer + 1;
						}
					}
				}
			}
		}
        return answer;
	}
}