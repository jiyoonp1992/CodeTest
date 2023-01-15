package Level0;

import java.util.Arrays;

public class level0_50 {
	//배열 회전시키기
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3};
		int[] num02 = {4, 455, 6, 4, -1, 45, 6};
		System.out.println(Arrays.toString(solution(num01, "right")));
		System.out.println(Arrays.toString(solution(num02, "left")));
	}
	
	public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
		boolean check = false;
		check = 3 <= numbers.length && numbers.length <= 20 && direction.equals("left") ||  direction.equals("right");
		if(check) {
			answer = new int[numbers.length];
			int j = 0;
			if(direction.equals("left")) {
				for(int i = 0; i < numbers.length; i++) {
					j = numbers[0];
					if(i != numbers.length -1) {
						answer[i] = numbers[i+1];
					} else {
						answer[i] =  j;
					}
				}
			}
			if(direction.equals("right")) {
				j = numbers[numbers.length - 1];
				for(int i = 1; i < numbers.length; i++) {
					if(i <= numbers.length -1) {
						answer[i] = numbers[i - 1];
					}
				}
				answer[0] =  j;
			}
		}
        return answer;
	}
}