package Level0;

import java.util.Arrays;

public class level0_26 {
//배열자르기
	public static void main(String[] args) {
		int[] subNum = {1, 2, 3, 4, 5};
		int[] subNum1 = {1, 3, 5};
		int num01 = 1, num02 = 3, num11 = 1, num12 = 2;
		System.out.println(solution(subNum, num01, num02));
		System.out.println(solution(subNum1, num11, num12));
	}
	
	public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
		boolean check = false;
		check = 2 <= numbers.length && numbers.length <= 30 && 0 <= num1 && num1 <= num2 && num2 <= numbers.length;
		if(check) {
			answer = new int[numbers.length - num2 - num1];
			for(int i = 0; i <= numbers.length-1; i++) {
				if(i <= num1) {
					
				} else if (i>=num2) {
					
				} else {
					answer[i] = numbers[i];
				}
					
			}
			
		}
        return answer;
	}

}
