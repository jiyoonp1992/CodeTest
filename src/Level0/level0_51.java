package Level0;

import java.util.Arrays;

public class level0_51 {
	//피자나눠먹기(2)
	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(10));
		System.out.println(solution(4));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 100;
		if(check) {
			for(int i = 1; i <= n; i++) {
				if((6*i)%n == 0) {
					answer = i;
					break;
				}
			}
		}
        return answer;
	}
}