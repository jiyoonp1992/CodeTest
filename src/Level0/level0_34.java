package Level0;

import java.util.Arrays;

public class level0_34 {
	
	public static void main(String[] args) {
		System.out.println(solution(20));
		System.out.println(solution(100));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 1000000;
		if(check) {
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					answer++;
				}
			}
		}
        return answer;
	}
}