package Level1;

import java.util.Arrays;

public class level1_001 {
	//짝수와 홀수
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int num) {
        String answer = "";
		boolean check = true;
		if(check) {
		}
		answer = num == 0 || num % 2 == 0 ? "Even":"Odd";
        return answer;
	}
}