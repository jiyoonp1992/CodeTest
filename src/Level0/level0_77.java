package Level0;

import java.util.Arrays;
import java.math.BigInteger;

public class level0_77 {
	//구슬을 나누는 경우의 수
	public static void main(String[] args) {
		//System.out.println(solution(3,1));
		//System.out.println(solution(1,1));
		//System.out.println(solution(5,3));
		//System.out.println(solution(3,2));
		//System.out.println(solution(4,1));
		//System.out.println(solution(4,2));
		//System.out.println(solution(30,23));
		//System.out.println(factorial(15));
//		solution(5,3);
		System.out.println(Math.random());
//		for(int i = 16; i <= 30; i++) {
//			for(int j = 16; j <= 30; j++) {
//				System.out.println("j = " + j + ", i = " + i + ", answer = " + solution(j,i));
//			}
//		}
	}

	
	public static int solution(int balls, int share) {
        int answer = 0;
		boolean check = false;
		check = 1 <= balls && balls <= 30 && 1 <= share && share <= 30 && share <= balls;
		if(check) {
			answer = 1;
			int j = 1;
			if(balls == share) {
				answer = 1;
			} else {
				long m = 0, n = 0;
				BigInteger sum = new BigInteger("1");
				for(int i = balls; i >= 1; i--) {
					n = (share < i && i <= balls) ? i : 1;
					m = (balls-share >= i) ? i : 1;
					BigInteger ni = new BigInteger(String.valueOf(n));
					BigInteger mi = new BigInteger(String.valueOf(m));
					sum = sum.multiply(ni).divide(mi);
				}
				answer = sum.intValue();
			}
		}
        return answer;
	}
}