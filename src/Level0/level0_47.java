package Level0;

import java.util.Arrays;

public class level0_47 {
	//대문자와 소문자
	public static void main(String[] args) {
		System.out.println(solution("cccCCC"));
		System.out.println(solution("abCdEfghIJ"));
	}
	
	public static String solution(String my_string) {
        String answer = "";
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 1000;
		if(check) {
			for(int i = 0; i < my_string.length(); i ++) {
				if(Character.isUpperCase(my_string.charAt(i))) {
					answer += Character.toLowerCase(my_string.charAt(i));
				} else {
					answer += Character.toUpperCase(my_string.charAt(i));
				}
			}
		}
        return answer;
	}
}