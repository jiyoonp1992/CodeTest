package Level0;

import java.util.Arrays;

public class level0_43 {
	//세균증식
	public static void main(String[] args) {
		System.out.println(solution(2, 10));
		System.out.println(solution(7, 15));
	}
	
	public static int solution(int n, int t) {
        int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 10 && 1 <= t && t <= 15;
		if(check) {
			answer = n * (int) (Math.pow(2, t));
		}
        return answer;
	}
}