package Level0;

import java.util.Arrays;

public class level0_40 {
	//모음제어
	public static void main(String[] args) {
		System.out.println(solution("bus"));
		System.out.println(solution("nice to meet you"));
	}
	
	public static String solution(String my_string) {
        String answer = "";
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 1000;
		if(check) {
			answer = my_string.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", ""); 
		}
        return answer;
	}
}