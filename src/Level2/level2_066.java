package Level2;

import java.util.Arrays;
import java.util.Stack;

public class level2_066 {
	//괄호 변환
	public static void main(String[] args) {
		//System.out.println(solution("(()())()"));
		//System.out.println(solution(")("));
		System.out.println(solution("()))((()"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	
	public static String solution(String p) {
		Stack<String> stStr = new Stack<>();
        String answer = "";
        divideBracket(p, stStr);
        while(!stStr.empty()) {
        	answer = changeBracket(stStr);
        }
        return answer;
	}
	
	//u,v 나누는 함수
	public static String divideBracket(String p, Stack<String> st) {
		String result = "";
		int lc = 0, rc = 0, tc = 0, tl = 0, cnt = 0;
		tl = p.length();
		for(int i = 0; i < tl; i++) {
			if(p.charAt(i) == '(') {
				lc++;
				tc++;
			} else {
				rc++;
				tc--;
			}
			
			if (tc == 0 && lc == rc && i + 1 != tl) {
				st.push(p.substring(0, i+1));
				p = p.substring(i+1);
				break;
			}
			
			if(tc == 0 && lc == rc && i + 1 == tl) {
				st.push(p);
				p = "";
				break;
			}
		}
		if(!p.isEmpty()) {
			divideBracket(p, st);
		}
		System.out.println("st1 = " + st);
		return result;
	}
	
	//u를 돌리고 v와 합치는 함수
	public static String changeBracket(Stack<String> st) {
		String u = "";
		String v = "";
		String w = "";
		String result = "";
		int uCnt = 0, uLC = 0, uTC = 0, uRC = 0;
		boolean chk = false;
		if(st.size() >= 2) {
			v = st.pop();
			u = st.pop();
		} else {
			u = st.pop();
		}
		uCnt = u.length();
		for(int j = 0; j < uCnt; j ++) {
			if(u.charAt(j) == '(') {
				uLC++;
				uTC++;
			} else {
				uRC++;
				uTC--;
			}
			
			if((uTC == 0 && uLC == uRC && j + 1 != uCnt) || (j == 0 && u.charAt(j) == ')')) {
				chk = false;
				break;
			}
			
			if(uTC == 0 && uLC == uRC && j + 1 == uCnt) {
				chk = true;
				break;
			}
		}
		if(!chk) {
			u = u.substring(1, u.length() - 1);
			u = u.replaceAll("\\(", "-").replaceAll("\\)", "(").replaceAll("-", ")");
			u = "(" + u + ")";
		}
		w = u + v;
		for(int k = 0;)
		if(!st.empty()) {
			divideBracket(w,st);
		} else {
			result = u + v;
		}
		return result;
	}
	
//	public static String correctBracket(String p, Stack<String> st, boolean check) {
//		String result = "";
//		String u = "";
//		String v = "";
//		String w = "";
//		boolean chk = check;
//		int lc = 0, rc = 0, tc = 0, tl = 0, cnt = 0;
//		tl = p.length();
//		if(p.isEmpty()) {
//			
//		} else {
//			for(int i = 0; i < tl; i++) {
//				if(p.charAt(i) == '(') {
//					lc++;
//					tc++;
//				} else {
//					rc++;
//					tc--;
//				}
//				
//				if(tc == 0 && lc == rc && i + 1 == tl) {
//					chk = true;
//					break;
//				} else if (tc == 0 && lc == rc && i + 1 != tl) {
//					u = p.substring(0, i+1);
//					v = p.substring(i+1);
//					st.push(u);
//					result = v;
//					break;
//				}
//			}
//			
//			if(chk) {
//				result = p;
//			} else {
//				correctBracket(v, st, chk);
//			}
//		}
//		return result;
//	}
}