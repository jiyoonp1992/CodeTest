package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_044 {
	//크기가 작은 부분문자열
	public static void main(String[] args) {
		//System.out.println(solution("3141592", "271"));
		System.out.println(solution("3141592", "1"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String t, String p) {
        int answer = 0;
		boolean check = 1 <= p.length() && p.length() <= 18 && p.length() <= t.length() && t.length() <= 10000;
		if(check) {
			String str = "";
			for(int i = 0; i <= t.length() - p.length();i++) {
				str = t.substring(i, i + p.length());
				if(Long.parseLong(str) <= Long.parseLong(p)) {
					answer++;
				}
			}
		}
        return answer;
	}
}