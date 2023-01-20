package Level0;

import java.util.Arrays;

public class level0_65 {
	//가까운수
	public static void main(String[] args) {
		int[] num01 = {3, 10, 28};
		int[] num02 = {10, 11, 12};
		System.out.println(solution(num01,20));
		System.out.println(solution(num02,13));
	}
	
	public static int solution(int[] array, int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= array.length && array.length <= 100 && 1 <= n && n <= 100;
		if(check) {
			for(int num:array) {
				answer = (num-n>=answer-n)?num:answer;
			}
		}
        return answer;
	}
}