package Level0;

import java.util.Arrays;

public class level0_58 {
	//문자열 정렬하기(2)
	public static void main(String[] args) {
		System.out.println(solution("Bcad"));
		System.out.println(solution("heLLo"));
		System.out.println(solution("Python"));
	}
	
	public static String solution(String my_string) {
        String answer = "";
		boolean check = false;
		check = 0 < my_string.length() && my_string.length() < 100;
		if(check) {
			my_string = my_string.toLowerCase();
			for(int i = 0; i < my_string.length(); i++) {
				for(int j = 0; j < my_string.length(); j++) {
					char tem = my_string.charAt(j);
				}
			}
		}
        return answer;
	}
}