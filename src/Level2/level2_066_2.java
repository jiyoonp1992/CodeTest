package Level2;

import java.util.Arrays;
import java.util.Stack;

public class level2_066_2 {
	//괄호 변환
	public static void main(String[] args) {
		System.out.println(solution("()))((()"));
	}
	
	public static String solution(String p) {
		String answer = "";
		answer = sortBracket(p);
        return answer;
	}
	
	public static String sortBracket(String p) {
		String sortResult = "";
		String u = "";
		String v = "";
		if(p.isEmpty()) {
			return sortResult;
		}
		int k = divideBracket(p);
		if(k < p.length()) {
			u = p.substring(0, k);
			v = p.substring(k, p.length());
		} else {
			u = p;
		}
		if(correctBracket(u)) {
			sortResult = u + sortBracket(v);
		} else {
			sortResult = "(" + sortBracket(v) + ")" + changerBracket(u);
		}
		return sortResult;
	}
	
	public static String changerBracket(String w) {
		String chanResult = "";
		chanResult = w.replaceAll("\\)", "-").replaceAll("\\(", "\\)").replaceAll("-", "\\(");
		return chanResult;
	}
	
	public static int divideBracket(String s) {
		int divIdx = 0;
		int cnt = 0;
		int j = s.length();
		for(int i = 0; i < j - 1; i++) {
			if(s.charAt(i) == '(') {
				cnt--;
			} else {
				cnt++;
			}
			if(cnt == 0) {
				divIdx = i + 1;
				break;
			} else {
				divIdx = 0;
			}
		}
		return divIdx;
	}
	
	public static boolean correctBracket(String c) {
		boolean corResult = false;
		int cnt = 0;
		for(int i = 0; i < c.length(); i++) {
			if(c.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if(cnt < 0) {
				break;
			} else {
				corResult = true;
			}
		}
		return corResult;
	}
	
}