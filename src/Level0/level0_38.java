package Level0;

import java.util.Arrays;

public class level0_38 {
	//개미군단
	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(24));
		System.out.println(solution(999));
	}
	
	public static int solution(int hp) {
        int answer = 0;
		boolean check = false;
		check = 0 <= hp && hp <= 1000;
		if(check) {
			answer = (hp / 5) + (hp%5)/3+((hp%5)%3)/1;
		}
        return answer;
	}
}