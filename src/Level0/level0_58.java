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
			char[] str = my_string.toCharArray();
			for(int i = 0; i < str.length; i++) {
				for(int j =0; j < str.length; j++) {
					if(str[i] <= str[j]) {
						char tem = str[j];
						str[j] = str[i];
						str[i] = tem;
					}
				}
			}
			answer = new String(str);
		}
        return answer;
	}
}