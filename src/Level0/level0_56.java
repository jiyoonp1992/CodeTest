package Level0;

import java.util.Arrays;

public class level0_56 {
	//숫자 찾기
	public static void main(String[] args) {
		System.out.println(solution(29183,1));
		System.out.println(solution(232443,4));
		System.out.println(solution(123456,7));
	}
	
	public static int solution(int num, int k) {
        int answer = 0;
		boolean check = false;
		check = 0 < num && num < 1000000 && 0 <= k && k < 10;
		if(check) {
			answer = (Integer.toString(num).indexOf(Integer.toString(k)) != -1) ? Integer.toString(num).indexOf(Integer.toString(k)) + 1 : Integer.toString(num).indexOf(Integer.toString(k));
		}
        return answer;
	}
}