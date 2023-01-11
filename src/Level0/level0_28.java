package Level0;

import java.util.Arrays;
import java.util.Random;

public class level0_28 {
	//최댓값 만들기(1)
	public static void main(String[] args) {
//		int[] srtNum = {1, 2, 3, 4, 5};
//		int[] srtNum1 = {0, 31, 24, 10, 1, 9};
//		System.out.println(solution(srtNum));
//		System.out.println(solution(srtNum1));
		Random rand = new Random();
		int[] srtNum = new int[10];
		for(int i = 0; i <10; i++) {
			srtNum[i]=rand.nextInt(10);
		}
		System.out.println(solution(srtNum));
	}
	
	public static int solution(int[] numbers) {
		int answer = 0;
		boolean check = false;
		check = 2 <= numbers.length && numbers.length <= 100;
		if(check) {
			int max = 0, dmax=0;
			for(int num:numbers) {
				if(0<= num && num <= 10000) {
					if (dmax <= num && num < max) {
						dmax = num;
					}
					if(max <= num) {
						dmax = max;
						max = num;
					}
				}
			}
			answer = max * dmax;
		}
        return answer;
	}
}