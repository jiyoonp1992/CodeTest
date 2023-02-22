package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_042 {
	//숫자 문자열과 영단어
	public static void main(String[] args) {
		System.out.println(solution("one"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String s) {
        int answer = 0;
		boolean check = 1 <= s.length() && s.length() <= 50;
		if(check) {
			answer = Integer.parseInt(s.replaceAll("zero", "0").replaceAll("one", "1").replaceAll("two", "2").replaceAll("three", "3").replaceAll("four", "4").replaceAll("five", "5").replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8").replaceAll("nine", "9"));
		}
        return answer;
	}
}