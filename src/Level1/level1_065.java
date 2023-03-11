package Level1;

import java.util.Arrays;

public class level1_065 {
	//크레인 인형뽑기 게임
	public static void main(String[] args) {
		int[][] num01 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		//int[][] num01 = {{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
		int[] num02 = {1,5,3,5,1,2,1,4};
		//int[] num02 = {1, 2, 3, 4};
		//solution(num01, num02);
		System.out.println(solution(num01, num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] xArr = {};
        int[] numArr = {};
        xArr = new int[Math.max(moves.length, board.length)];
        numArr = new int[Math.max(moves.length, board.length)];
        int x = 0;
		for(int i:moves) {
			for(int j = xArr[i-1]; j < board.length; j++) {
				if(board[j][i-1] != 0) {
					if(x == 0) {
						numArr[x] = board[j][i-1];
						x++;
					} else if (numArr[x-1] == board[j][i-1]){
						numArr[x-1] = 0;
						x--;
						answer += 2;
					} else {
						numArr[x] = board[j][i-1];
						x++;
					}
					board[j][i-1] = 0;
					xArr[i-1] = j;
					break;
				}
			}
		}
        return answer;
	}
}