package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_027 {
	//문자열 다루기 기본
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("12a34"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
		boolean check = 1 <= s.length() && s.length() <= 8;
		if(check) {
			if(s.length() != 4 && s.length() != 6) {
				answer = false;
			} else {
				for(int i = 0; i < s.length(); i++) {
					if(!Character.isDigit(s.charAt(i))) {
						answer = false;
						break;
					}
				}
			}
		}
        return answer;
	}
}