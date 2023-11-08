package Level2;

import java.util.Arrays;
import java.util.Stack;

public class level2_066_1 {
	//괄호 변환
	public static void main(String[] args) {
		//System.out.println(solution("(()())()"));
		//System.out.println(solution(")("));
		System.out.println(solution("()))((()"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String p) {
		String answer = "";
		String[] strArr = {"", ""};
		boolean correctChk = false;
		divideBracket(p, strArr);
		correctChk = correctBracket(strArr[0]);
		if(!correctChk) {
			//changerBracket(strArr);
		}
        return answer;
	}
	
	public static void divideBracket(String p, String[] strArr) {
		int cnt = 0;
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if(cnt == 0 && i < p.length()-1) {
				strArr[0] = p.substring(0, i+1);
				strArr[1] = p.substring(i+1);
				break;
			} else if(cnt == 0) {
				strArr[0] = p;
				strArr[1] = "";
				break;
			}
		}
	}
	
	public static boolean correctBracket(String w) {
		boolean chk = false;
		if(w.charAt(0) == '(') {
			chk = true;
		}
		if(!chk) {
			//changerBracket(w);
		}
		return result;
	}
}