package Level0;

import java.util.Arrays;

public class level0_78 {
	//컨트롤 제트
	public static void main(String[] args) {
//		System.out.println(solution("1 2 Z 3"));
//		System.out.println(solution("10 20 30 40"));
//		System.out.println(solution("10 Z 20 Z 1"));
//		System.out.println(solution("10 Z 20 Z"));
		System.out.println(solution("-1 -2 -3 Z"));
		//System.out.println(Integer.parseInt("-1"));
	}
	
	public static int solution(String s) {
        int answer = 0;
		boolean check = false;
		check = 1 <= s.length() && s.length() <= 200;
		if(check) {
			int num = 0, idx = 0;
			for (int i = 0; i < s.length();) {
				idx = s.indexOf(' ');
				if(idx != -1) {
					if(Character.isDigit(s.charAt(0))) {
						num = Integer.parseInt(s.substring(0,idx));
						answer += num;
					} else if(s.charAt(0) == 'Z') {
						answer -= num;
					} else if(s.charAt(0) == '-') {
						num = Integer.parseInt(s.substring(0,idx));
						answer += num;
					}
					s = s.substring(idx).trim();
				} else {
					if(Character.isDigit(s.charAt(0))) {
						num = Integer.parseUnsignedInt(s);
						answer += num;
					} else if(s.charAt(0) == 'Z') {
						answer -= num;
					} else if(s.charAt(0) == '-') {
						num = Integer.parseInt(s.substring(0,idx));
						answer += num;
					}
					s = "";
				}
			}
		}
        return answer;
	}
}