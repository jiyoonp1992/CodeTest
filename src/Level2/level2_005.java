package Level2;

import java.util.Arrays;

public class level2_005 {
	//이진 변환 반복하기
	public static void main(String[] args) {
		//System.out.println(solution("01110"));
		System.out.println(Arrays.toString(solution("01110")));
	}
	
	public static int[] solution(String s) {
        int[] answer = {};
        answer = new int[2];
        String str = "";
        for(int i = 0; i < 1;) {
        	for(int j = 0; j < s.length(); j++) {
        		if(s.charAt(j) == '0') {
        			answer[1]++;
        		} else {
        			str += s.charAt(j);
        		}
        	}
        	
        	answer[0]++;
        	if(str.equals("1")) {
        		i = 1;
        		break;
        	} else {
        		s = Integer.toBinaryString(str.length());
        		str = "";
        	}
        }
        return answer;
	}
}