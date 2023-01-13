package Level0;

import java.util.Arrays;

public class level0_46 {
	//암호 해독
	public static void main(String[] args) {
		System.out.println(solution("dfjardstddetckdaccccdegk", 4));
		System.out.println(solution("pfqallllabwaoclk", 2));
	}
	
	public static String solution(String cipher, int code) {
        String answer = "";
		boolean check = false;
		check = 1 <= cipher.length() && cipher.length() <= 1000 && 1 <= code && code <= cipher.length();
		if(check) {
			for(int i = 1; i*code <= cipher.length(); i++) {
				if(code <= cipher.length()) {
					answer += cipher.charAt(i*code-1);
				}
			}
		}
        return answer;
	}
}