package Level1;

import java.util.Arrays;

public class level1_070 {
	//둘만의 암호
	public static void main(String[] args) {
		System.out.println(solution("zzzzzz", "abcdefghijklmnopqrstuvwxy", 6));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s, String skip, int index) {
        String answer = "";
        char[] chArr = {};
        int cnt = 0;
        for(int i = 97; i <= 122; i++) {
        	if(!skip.contains(String.valueOf((char) i))) {
        		chArr = Arrays.copyOf(chArr, chArr.length + 1);
        		chArr[cnt] = Character.valueOf((char) i);
        		cnt++;
        	}
        }
        
        System.out.println(Arrays.toString(chArr));
        return answer;
	}
}