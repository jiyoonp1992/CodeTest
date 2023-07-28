package Level2;

import java.util.Arrays;

public class level2_066 {
	//괄호 변환
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String p) {
        String answer = "";
        int rP = 0, lP = 0;
        for(int i = 0; i < p.length(); i++) {
        	if(i == 0 && p.charAt(i) == '}') {
        		break;
        	} else {
        		if(p.charAt(i) == '{') {
        			lP++;
        		} else if(lP > 0 && p.charAt(i) == '}') {
        			lP--;
        		} else if(lP <= 0 && p.charAt(i) == '}') {
        			break;
        		}
        	}
        }
        
        
        return answer;
	}
}