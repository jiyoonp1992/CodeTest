package Level1;

import java.util.Arrays;

public class level1_070 {
	//둘만의 암호
	public static void main(String[] args) {
		//System.out.println(solution("zzzzzz", "abcdefghijklmnopqrstuvwxy", 6));
		System.out.println(solution("aukks", "wbqd", 5));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s, String skip, int index) {
        String answer = "";
        String[] chArr = {};
        int cnt = 0;
        for(int i = 97; i <= 122; i++) {
        	if(!skip.contains(String.valueOf((char) i))) {
        		chArr = Arrays.copyOf(chArr, chArr.length + 1);
        		chArr[cnt] = String.valueOf((char) i);
        		cnt++;
        	}
        }
        int idx = 0, x = 0;
        for(int j = 0; j < s.length();j++) {
        	idx = Arrays.asList(chArr).indexOf(String.valueOf(s.charAt(j)));
        	x = idx + index;
        	if(x >= chArr.length) {
        		x = x - (chArr.length * (x / chArr.length));
        	}
        	
        	answer += chArr[x];
        	
        	idx = 0;
        	x = 0;
        }
        
        return answer;
	}
}