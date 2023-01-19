package Level0;

import java.util.Arrays;

public class level0_61 {
	//중복된 문자 제거
	public static void main(String[] args) {
		System.out.println(solution("people"));
		System.out.println(solution("We are the world"));
	}
	
	public static String solution(String my_string) {
        String answer = "";
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 110;
		if(check) {
			for(int i = 0; i < my_string.length(); i++) {
				if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
					answer += my_string.charAt(i);
				}
			}
		}
        return answer;
	}
}