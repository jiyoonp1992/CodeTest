package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_022 {
	//가운데 글자 가져오기
	public static void main(String[] args) {
		String str01 = "abcde";
		String str02 = "qwer";
		System.out.println(solution(str01));
		System.out.println(solution(str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s) {
        String answer = "";
		boolean check = 1 <= s.length() && s.length() <= 100;
		int i = 0;
		if(check) {
			if(s.length() % 2 == 0) {
				i = s.length()/2;
				answer = s.substring(i-1, i+1);
			} else {
				i = s.length()/2;
				answer = s.substring(i, i+1);
			}
		}
        return answer;
	}
}