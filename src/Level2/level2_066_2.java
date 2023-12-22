package Level2;

import java.util.Arrays;
import java.util.Stack;

public class level2_066_2 {
	//괄호 변환
	public static void main(String[] args) {
		//System.out.println(solution("(()())()"));
		//System.out.println(solution(")("));
		System.out.println(solution("()))((()"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	static boolean nullchk = false;
	public static String solution(String p) {
		String answer = "";
		Stack<String> st = new Stack<String>();
		while (!p.isEmpty()) {
			int cnt = 0;
			for(int i = 0; i < p.length(); i++) {
				if(p.charAt(i) == '(') {
					cnt++;
				} else {
					cnt--;
				}
				if(cnt == 0 && i == p.length() - 1) {
					st.push(p);
					p = "";
				} else if (cnt == 0) {
					//최소 문자열
					st.push(p.substring(0, i+1));
					p = p.substring(i + 1);
				}
			}
		}
		
		while (!st.empty()) {
			String u = "";
			u = st.peek();
			if(u.charAt(0) == '(') {
				//올바른
			} else {
				//균형잡힌
			}
		}
		
        return answer;
	}
	
	public static void divideBracket(String p, boolean nullchk) {
		int cnt = 0;
		String u = "";
		String v = "";
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if(cnt == 0) {
				//최소 문자열
				u = p.substring(0, i+1);
				v = p.substring(i + 2);
				break;
			}
		}
		
		if(!v.isEmpty()) {
			//v가 빈 문자열이 아닌경우
			if(u.charAt(0) == '(') {
				//올바른
				//changerBracket(v, nullchk);
			} else {
				//균형
				divideBracket(v, nullchk);
			}
		} else {
			//v가 빈 문자열인 경우
		}
	}
	
	public static String changerBracket(Stack<String> st) {
		String result = "";
		return result;
	}
	
}