package Level2;

import java.util.Arrays;

public class level2_004 {
	//올바른 괄호
	public static void main(String[] args) {
		System.out.println(solution("()()"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        int x = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				x++;
			} else {
				if(x == 0) {
					answer = false;
					return false;
				} else {
					x--;
				}
			}
		}
		if(x != 0) {
			answer = false;
		}
        return answer;
	}
}