package Level2;

import java.util.Arrays;

public class level2_007 {
	//피보나치 수
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(50));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
		int answer = 0;
        int k = 0, m = 0, sum = 0;
		for(int i = 1; i <= n; i++) {
			if(k == 0) {
				k = 1;
				sum = 1;
				continue;
			}
			sum = ((m % 1234567) + (k % 1234567)) % 1234567;
			m = k % 1234567; 
			k = sum % 1234567;
		}
		answer = sum;
        return answer;
	}
}