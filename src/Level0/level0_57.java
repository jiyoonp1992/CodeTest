package Level0;

import java.util.Arrays;

public class level0_57 {
	//369게임
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(29423));
	}
	
	public static int solution(int order) {
        int answer = 0;
		boolean check = false;
		check = 1 <= order && order <= 1000000;
		if(check) {
			String str = String.valueOf(order); 
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9' ){
					answer++;
				}
			}
		}
        return answer;
	}
}