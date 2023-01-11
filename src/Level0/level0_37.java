package Level0;

import java.util.Arrays;

public class level0_37 {
	//제곱수 판별하기
	public static void main(String[] args) {
		System.out.println(solution(144));
		System.out.println(solution(976));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 1000000;
		if(check) {
			if(Math.sqrt(n) % 1 == 0) {
				answer = 1;
			}else {
				answer = 2;
			}
		}
        return answer;
	}
}