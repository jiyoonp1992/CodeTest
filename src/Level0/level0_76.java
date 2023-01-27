package Level0;

import java.util.Arrays;

public class level0_76 {
	//문자열 계산하기
	public static void main(String[] args) {
		System.out.println(solution("3 - 4 + 5"));
	}
	
	public static int solution(String my_string) {
        int answer = 0;
		boolean check = false;
		check = 5 <= my_string.length() && my_string.length() <= 100;
		if(check) {
			my_string = "+ " + my_string;
			int idx = 0;
			String sign = "";
			for(int i = 0; i < my_string.length();) {
				idx = my_string.indexOf(" ");
				if(Character.isDigit(my_string.charAt(i))) {
					if(idx != -1) {
						if(sign == "p") {
							answer += Integer.parseInt(my_string.substring(0, idx));
						} else {
							answer -= Integer.parseInt(my_string.substring(0, idx));
						}
						my_string = my_string.substring(idx).trim();
					} else {
						if(sign == "p") {
							answer += Integer.parseInt(my_string);
						} else {
							answer -= Integer.parseInt(my_string);
						}
						my_string = "";
					}
				} else {
					if(my_string.charAt(i) == '+') {
						sign = "p";
					} else {
						sign = "m";
					}
					my_string = my_string.substring(1).trim();
				}
			}
		}
        return answer;
	}
}
