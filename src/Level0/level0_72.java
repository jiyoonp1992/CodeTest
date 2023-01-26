package Level0;

import java.util.Arrays;

public class level0_72 {
	//공 던지기
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3, 4};
		int[] num02 = {1, 2, 3, 4, 5, 6};
		int[] num03 = {1, 2, 3};
		System.out.println(solution(num01, 2));
		System.out.println(solution(num02, 5));
		System.out.println(solution(num03, 3));
	}
	
	public static int solution(int[] numbers, int k) {
        int answer = 0;
		boolean check = false;
		check = 2 < numbers.length && numbers.length < 100 && 0 < k && k < 1000;
		if(check) {
			int cnt = 0;
			cnt = (k - 1) * 2 % numbers.length;
			answer = numbers[cnt];
		}
        return answer;
	}
}