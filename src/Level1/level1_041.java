package Level1;

import java.util.Arrays;

public class level1_041 {
	//K번째수
	public static void main(String[] args) {
		int[] num01 = {1, 5, 2, 6, 3, 7, 4};
		int[][] num11 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution(num01, num11));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
		boolean check = 1 <= array.length && array.length <=100;
		if(check) {
			int[] intArr = {};
			answer = new int[commands.length];
			for(int i = 0; i < answer.length; i++) {
				intArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
				Arrays.sort(intArr);
				answer[i] = intArr[commands[i][2]-1];
			}
		}
        return answer;
	}
}