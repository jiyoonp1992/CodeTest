package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_057 {
	//로또의 최고 순위와 최저 순위
	public static void main(String[] args) {
		int[] num01 = {0, 0, 0, 0, 0, 0};
		int[] num02 = {38, 19, 20, 40, 15, 25};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01, num02)));
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
		answer = new int[2];
		for(int i : lottos) {
			if(i == 0) {
				answer[0]++;
			}
			if(Arrays.stream(win_nums).anyMatch(n -> n == i)) {
				answer[0]++;
				answer[1]++;
			}
		}
		switch (answer[0]) {
		case 6:
			answer[0] = 1;
			break;
		case 5:
			answer[0] = 2;
			break;
		case 4:
			answer[0] = 3;
			break;
		case 3:
			answer[0] = 4;
			break;
		case 2:
			answer[0] = 5;
			break;

		default:
			answer[0] = 6;
			break;
		}
		
		switch (answer[1]) {
		case 6:
			answer[1] = 1;
			break;
		case 5:
			answer[1] = 2;
			break;
		case 4:
			answer[1] = 3;
			break;
		case 3:
			answer[1] = 4;
			break;
		case 2:
			answer[1] = 5;
			break;

		default:
			answer[1] = 6;
			break;
		}
        return answer;
	}
}