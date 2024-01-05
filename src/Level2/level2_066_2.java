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
		answer = sortBk(p);
        return answer;
	}
	
	public static String sortBk(String p) {
		String sortResult = "";
		if(p.isEmpty()) {
			return "";
		}
		int k = divisBk(p);
		String u = p.substring(0, k);
		String v = p.substring(k);
		boolean check = crctBk(u);
		if(check) {
			sortResult = u + sortBk(v);
		} else {
			sortResult = "(" + sortBk(v) + ")" + rvrsBk(u);
		}
		System.out.println(sortResult);
		return sortResult;
	}
	
	public static int divisBk(String p) {
		int divisResult = 0;
		int sum = 0;
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				sum++;
			} else {
				sum--;
			}
			if(sum == 0) {
				divisResult = i + 1;
				break;
			}
		}
		return divisResult;
	}
	
	public static boolean crctBk(String p) {
		boolean crctResult = false;
		if(p.charAt(0) == '(') {
			crctResult = true;
		}
		return crctResult;
	}
	
	public static String rvrsBk(String p) {
		String rvrsResult = "";
		rvrsResult = p.replaceAll("\\(", "_").replaceAll("\\)", "\\(").replaceAll("_", "\\)");
		rvrsResult = rvrsResult.substring(1, rvrsResult.length() - 1);
		return rvrsResult;
	}
	
}