package Level2;

import java.util.Arrays;

public class level2_016 {
	//멀리 뛰기
	public static void main(String[] args) {
		System.out.println(solution(3));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static long solution(int n) {
        long answer = 0;
        long max = 1, min = 0, temp = 0;
        for(int i = 2; i <= n; i++) {
        	temp = max + min;
        	min = max % 1234567;
        	max = temp % 1234567;
        }
        answer = (max + min) % 1234567;
        return answer;
	}
}