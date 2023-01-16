package Level0;

import java.util.Arrays;

public class level0_53 {
	//최댓값 만들기2
	public static void main(String[] args) {
		int[] num1 = {1, 2, -3, 4, -5};
		int[] num2 = {0, -31, 24, 10, 1, 9};
		int[] num3 = {10, 20, 30, 5, 5, 20, 5};
		System.out.println(solution(num1));
		System.out.println(solution(num2));
		System.out.println(solution(num3));
	}
	
	public static int solution(int[] numbers) {
        int answer = 0;
		boolean check = false;
		check = 2 <= numbers.length && numbers.length <= 100;
		if(check) {
			//Arrays.sort(numbers);
			//answer = (numbers[0] * numbers[1] > numbers[numbers.length-2] * numbers[numbers.length-1]) ? numbers[0] * numbers[1] : numbers[numbers.length-2] * numbers[numbers.length-1];
			
			for(int i = 0; i < numbers.length; i++) {
				for(int j = 0; j < numbers.length; j++) {
					if(numbers[i] < numbers[j]) {
					int tem = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tem;
					}
				}
			}
			answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length-2] * numbers[numbers.length-1]);
			
		}
        return answer;
	}
}