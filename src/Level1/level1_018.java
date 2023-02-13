package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_018 {
	//핸드폰 번호 가리기
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String phone_number) {
        String answer = "";
		boolean check = 4 <= phone_number.length() && phone_number.length() <= 20;
		if(check) {
			for(int i = 0; i <= phone_number.length() - 5; i++) {
				answer += "*";
			}
			answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
		}
        return answer;
	}
}