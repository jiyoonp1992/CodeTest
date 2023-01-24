package Level0;

import java.util.Arrays;

public class level0_68 {
	//한 번만 등장한 문자
	public static void main(String[] args) {
		System.out.println(solution("abcabcadc"));
		System.out.println(solution("abdc"));
		System.out.println(solution("hello"));
	}
	
	public static String solution(String s) {
        String answer = "";
		boolean check = false;
		check = 0 < s.length() && s.length() < 1000;
		if(check) {
			for(int i = 0; i < s.length(); i++) {
				int cnt = 0;
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(i) == s.charAt(j)) {
						cnt++;
					}
				}
				if(cnt == 1) {
					answer += s.charAt(i);
				}
			}
			char[] c = answer.toCharArray();
			Arrays.sort(c);
			answer = new String(c);
		}
        return answer;
	}
}