package Level2;

import java.util.Arrays;

public class level2_009 {
	//짝지어 제거하기
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String s) {
        int answer = -1;
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < s.length(); i++) {
        	if(sb.length() == 0) {
        		sb.append(s.charAt(i));
        	} else if(sb.charAt(sb.length() - 1) == s.charAt(i)) {
        		sb.deleteCharAt(sb.length() - 1);
        	} else {
        		sb.append(s.charAt(i));
        	}
        }
        if(sb.length() == 0) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        return answer;
	}
}