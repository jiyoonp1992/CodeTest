package Level0;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.stream.IntStream;

public class level0_39 {
	//숨어있는 숫자의 덧셈(1)
	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123"));
	}
	
	public static int solution(String my_string) {
        int answer = 0;
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 1000;
		if(check) {
			for(int i = 0; i < my_string.length(); i++) {
				if(Character.isDigit(my_string.charAt(i))) {
					answer += Character.getNumericValue(my_string.charAt(i));
				}
			}
		}
        return answer;
	}
}