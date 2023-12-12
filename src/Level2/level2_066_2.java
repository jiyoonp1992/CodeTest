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
	
	public static String solution(String p) {
		String answer = "";
		Stack<String> stStr = new Stack<String>();
		divideBracket(p, stStr);
		answer = changerBracket(stStr);
        return answer;
	}
	
	public static void divideBracket(String p, Stack<String> st) {
		int cnt = 0;
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if(cnt == 0 && i < p.length()-1) {
				st.push(p.substring(0, i+1));
				p = p.substring(i+1);
				i = -1;
			} else if(cnt == 0) {
				st.push(p);
			}
		}
	}
	
	public static String changerBracket(Stack<String> st) {
		String result = "";
		String v = "";
		String u = "";
		String w = "";
		while(st.size() > 1) {
			v = st.pop();
			if(v.charAt(0) == ')') {
				v = v.substring(1, v.length() - 1);
				v = v.replaceAll("\\(", "-").replaceAll("\\)", "(").replaceAll("-", ")");
				w = "(" + "" + ")" + v;
			} else {
				u = st.pop();
				w = u + v;
			}
			st.push(w);
			System.out.println("w = " + w);
			System.out.println("u = " + u);
			System.out.println("v = " + v);
			System.out.println("st = " + st);
			System.out.println("------------------");
		}
		result = st.pop();
		return result;
	}
	
}