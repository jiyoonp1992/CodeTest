package Level0;

import java.util.Arrays;

public class level0_97 {
	//안전지대
	public static void main(String[] args) {
		int[][] num01 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		int[][] num02 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
		int[][] num03 = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
		//System.out.println(solution(num01));
		//System.out.println(solution(num02));
		System.out.println(solution(num03));
	}
	
	public static int solution(int[][] board) {
        int answer = 0;
		boolean check = false;
		check = board.length == board[0].length && 1 <= board.length && board.length <= 100;
		if(check) {
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board.length; j++) {
					if(i == 0) {
						if(j == 0) {
							answer = board[i][j] == 1 && board[i][j+1] == 1 && board[i + 1][j] == 1 && board[i + 1][j + 1] == 1 ?answer:answer++; 
						} else if (j == board[0].length) {
							answer = board[i][j] == 1 && board[i][j-1] == 1 && board[i + 1][j] == 1 && board[i + 1][j - 1] == 1 ?answer:answer++;
						} else {
							answer = board[i][j - 1] == 1 && board[i][j] == 1 && board[i][j + 1] == 1 && board[i + 1][j - 1] == 1 && board[i + 1][j] == 1 && board[i + 1][j + 1] == 1 ? answer:answer++;
						}
					} else if (i == board.length) {
						if(j == 0) {
							answer = board[i - 1][j] == 1 && board[i - 1][j+1] == 1 && board[i][j] == 1 && board[i][j + 1] == 1 ?answer:answer++; 
						} else if (j == board[0].length) {
							answer = board[i][j] == 1 && board[i][j-1] == 1 && board[i - 1][j] == 1 && board[i - 1][j - 1] == 1 ?answer:answer++;
						} else {
							answer = board[i][j - 1] == 1 && board[i][j] == 1 && board[i][j + 1] == 1 && board[i - 1][j - 1] == 1 && board[i - 1][j] == 1 && board[i - 1][j + 1] == 1 ? answer:answer++;
						}
					} else if (j == 0) {
						answer = board[i - 1][j] == 1 && board[i][j] == 1 && board[i + 1][j] == 1 && board[i - 1][j + 1] == 1 && board[i][j + 1] == 1 && board[i + 1][j + 1] == 1 ? answer:answer++;
					} else if (j == board[0].length) {
						//3.4
						answer = board[i- 1 ][j - 1] == 1 && board[i - 1][j] == 1 && board[i][j - 1] == 1 && board[i][j] == 1 && board[i + 1][j - 1] == 1 && board[i][j + 1] == 1 ? answer:answer++;
					} else {
						answer = board[i - 1][j - 1] == 1 && board[i - 1][j] == 1 && board[i - 1][j + 1] == 1 && board[i][j - 1] == 1 && board[i][j] == 1 && board[i][j + 1] == 1
								&& board[i + 1][j - 1] == 1 && board[i + 1][j] == 1 && board[i + 1][j + 1] == 1 && board[i][j + 1] == 1? answer:answer++;
					}
					System.out.println(board[i][j]);
					System.out.println(answer);
					System.out.println("-----------");
				}
			}
		}
        return answer;
	}
}