package Level0;

import java.util.Arrays;

public class level0_70 {
	//숨어있는 숫자의 덧셈 (2)
	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123Z"));
	}
	
	public static int solution(String my_string) {
        int answer = 0;
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 1000;;
		if(check) {
			//my_string += " ";
			for(int i = 0; i < my_string.length(); i++) {
				int cnt = 0;
				if(Character.isDigit(my_string.charAt(i))) {
					for(int j = i + 1; j < my_string.length(); j++) {
						if(Character.isDigit(my_string.charAt(j))) {
							cnt++;
						} else {
							break;
						}
					}
					answer += Character.getNumericValue(my_string.charAt(i)) * Math.pow(10, cnt);
				}
			}
		}
        return answer;
	}
}