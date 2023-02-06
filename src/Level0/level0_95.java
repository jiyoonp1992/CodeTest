package Level0;

import java.util.Arrays;

public class level0_95 {
	//분수의 덧셈
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1,2,3,4)));
		System.out.println(Arrays.toString(solution(9,2,1,3)));
		System.out.println(Arrays.toString(solution(2,8,2,8)));
	}
	
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
		boolean check = false;
		check = 0 < numer1 && numer1 < 1000 && 0 < denom1 && denom1 < 1000 && 0 < numer2 && numer2 < 1000 && 0 < denom2 && denom2 < 1000;
		if(check) {
			answer = new int[2];
			int x = 0, y = 0;
			x = numer1 * denom2 + numer2 * denom1;
			y = denom1 * denom2;
			
			for(int i = 2; i <= Math.min(x, y); i++) {
				if(x % i == 0 && y % i == 0) {
					x /= i;
					y /= i;
					i--;
				}
			}
			answer[0] = x;
			answer[1] = y;
		}
        return answer;
	}
}