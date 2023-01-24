package Level0;

import java.util.Arrays;

public class level0_65 {
	//가까운수
	public static void main(String[] args) {
		int[] num01 = {3, 10, 28};
		int[] num02 = {10, 11, 12};
		int[] num03 = {2, 2, 3};
		int[] num04 = {9, 11, 12};
		int[] num05 = {15, 11, 13};
		int[] num06 = {1,3,5,7,9,11,13,15};
		System.out.println(solution(num01,20));
		System.out.println(solution(num02,13));
		System.out.println(solution(num03,1));
		System.out.println(solution(num04,10));
		System.out.println(solution(num05,14));
		System.out.println(solution(num06,2));
	}
	
	public static int solution(int[] array, int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= array.length && array.length <= 100 && 1 <= n && n <= 100;
		if(check) {
			answer = array[0];
			for(int num:array) {
				if(num-n < 0 || answer - n < 0) {
					if(Math.abs(num-n) == Math.abs(answer-n)) {
						answer = num > answer ? answer:num;
					}else {
						answer = Math.abs(num-n) > Math.abs(answer-n) ? answer : num;
					}
				} else if(num - n > 0) {
					answer = Math.abs(num-n) < Math.abs(answer-n)?num:answer;
				} else {
					answer = num;
				}
			}
		}
        return answer;
	}
}