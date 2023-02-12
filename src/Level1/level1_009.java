package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_009 {
	//문자열을 정수로 바꾸기
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String s) {
        int answer = 0;
        try {
			answer = Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			if(s.charAt(0) == '+') {
				answer = Integer.parseInt(s.substring(1, s.length()));
			} else {
				answer -= Integer.parseInt(s.substring(1, s.length()));
			}
			
		}
        return answer;
	}
}