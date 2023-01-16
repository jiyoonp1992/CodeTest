package Level0;

import java.util.Arrays;

public class level0_52 {
	//인덱스 바꾸기
	public static void main(String[] args) {
		System.out.println(solution("hello", 1, 2));
		System.out.println(solution("I love you", 1, 2));
	}
	
	public static String solution(String my_string, int num1, int num2) {
        String answer = "";
		boolean check = false;
		check = 1 < my_string.length() && my_string.length() < 100 && 0 <= num1 && 0 <= num2 && num2 < my_string.length(); 
		if(check) {
			for(int i = 0; i < my_string.length(); i++) {
				if(i == num1) {
					answer += my_string.charAt(num2);
				} else if(i == num2) {
					answer += my_string.charAt(num1);
				} else {
					answer += my_string.charAt(i);
				}
			}
		}
        return answer;
	}
}