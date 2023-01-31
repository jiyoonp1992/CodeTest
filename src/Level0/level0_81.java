package Level0;

import java.util.Arrays;

public class level0_81 {
	//캐릭터의 좌표
	public static void main(String[] args) {
		String[] str01 = {"left", "right", "up", "right", "right"};
		String[] str02 = {"down", "down", "down", "down", "down"};
		String[] str03 = {"left", "left", "left", "right"};
		int[] num01 = {11,11};
		int[] num02 = {7,9};
		int[] num03 = {3,3};
		//System.out.println(Arrays.toString(solution(str01, num01)));
		//System.out.println(Arrays.toString(solution(str02, num02)));
		System.out.println(Arrays.toString(solution(str03, num03)));
	}
	
	public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
		boolean check = false;
		check = 0 <= keyinput.length && keyinput.length <= 50 && 1 <= board[0] && board[0] <= 99 && 1 <= board[1] && board[1] <= 99;
		if(check) {
			answer = new int[2];
			int ud = (board[1]-1)/2, lr =(board[0]-1)/2, x = 0, y = 0;
			for(String str : keyinput) {
				System.out.println(ud);
				System.out.println(lr);
				if("up".equals(str)) {
					if(ud > y) {
						y++;
					}
				} else if ("down".equals(str)) {
					if(Math.abs(ud) > Math.abs(y)) {
						y--;
					}
				} else if ("left".equals(str)) {
					if(Math.abs(lr) > Math.abs(x)) {
						System.out.println("le");
						x--;
					}
				} else {
					if(Math.abs(lr) > Math.abs(x)) {
						System.out.println("ri");
						x++;
					}
				}
			}
			answer[0] = x;
			answer[1] = y;
		}
        return answer;
	}
}