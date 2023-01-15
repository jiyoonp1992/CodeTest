package Level0;

import java.util.Arrays;

public class level0_48 {
	//가장 큰 수 찾기
	public static void main(String[] args) {
		int[] num01 = {1, 8, 3};
		int[] num02 = {9, 10, 11, 8};
		System.out.println(Arrays.toString(solution(num01)));
		System.out.println(Arrays.toString(solution(num02)));
	}
	
	public static int[] solution(int[] array) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= array.length && array.length <= 100;
		if(check) {
			answer = new int[2];
			for(int i = 0 ; i < array.length; i++) {
				if(answer[0] <= array[i]) {
					answer[0] = array[i];
					answer[1] = i;
				}
			}
		}
        return answer;
	}
}