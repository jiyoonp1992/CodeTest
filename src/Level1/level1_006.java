package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_006 {
	//문자열 내 p와 y의 개수
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
		boolean check = false;
		check = 0 < s.length() && s.length() <= 50;
		if(check) {
			s = s.toLowerCase();
			int p = 0, y= 0;
			for(int i = 0; i < s.length(); i++) {
				p = s.charAt(i) == 'p' ? ++p : p;
				y = s.charAt(i) == 'y' ? ++y : y;
			}
			answer = p == 0 && y == 0? true : p == y ? true:false;
		}
        return answer;
	}
}