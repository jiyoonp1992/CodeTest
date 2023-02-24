package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_049 {
	//가장 가까운 같은 글자
	public static void main(String[] args) {
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution("banana")));
	}
	
	public static int[] solution(String s) {
        int[] answer = {};
		boolean check = 1 <= s.length() && s.length() <= 10000;
		if(check) {
			answer = new int[s.length()]; 
			char[] ch = s.toCharArray();
			for(int i = 0; i < ch.length; i++) {
				for(int j = 0; j < i;j++) {
					if(ch[i] == ch[j]) {
						answer[i] = Math.abs(i-j);
					}
				}
				if(answer[i] == 0) {
					answer[i] = -1;
				}
			}
			
		}
        return answer;
	}
}