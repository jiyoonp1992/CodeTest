package Level0;

import java.util.Arrays;

public class level0_76 {
	//문자열 계산하기
	public static void main(String[] args) {
		System.out.println(solution("3 + 4"));
	}
	
	public static int solution(String my_string) {
        int answer = 0;
		boolean check = false;
		check = 5 <= my_string.length() && my_string.length() <= 100;
		if(check) {
			for(int i = 0; i < my_string.length();) {
				int cnt = 0;
				int num = 0;
				if(!Character.isDigit(my_string.charAt(i))) {
					if(my_string.charAt(i) == '+') {
						answer = answer + num;
					} else {
						answer = answer - num;
					}
				} else {
					cnt = my_string.indexOf(' ');
					num = Integer.parseInt(my_string.substring(0, cnt));
				}
				my_string = my_string.substring(cnt).trim();
			}
		}
        return answer;
	}
}