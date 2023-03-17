package Level2;

import java.util.Arrays;

public class level2_002 {
	//JadenCase 문자열 만들기
	public static void main(String[] args) {
		System.out.println(solution("qwe      QWE"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s) {
        String answer = "";
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(i == 0 || num == 1 && s.charAt(i) != ' ') {
        		answer += s.toUpperCase().charAt(i);
        		num = 0;
        	} else {
        		if(s.charAt(i) == ' ') {
        			num = 1;
        		}
        		answer += s.toLowerCase().charAt(i);
        	}
        }
        return answer;
	}
}