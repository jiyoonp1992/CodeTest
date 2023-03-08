package Level1;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class level1_059 {
	//숫자 짝꿍
	public static void main(String[] args) {
		//System.out.println(solution("100", "203045" ));
		//System.out.println(solution("0000000000000000000", "0000000000000000000" ));
		System.out.println(solution("12321", "42531" ));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String X, String Y) {
        String answer = "";
		boolean check = 3 <= X.length() && X.length() <= 3000000 && 3 <= Y.length() && Y.length() <= 3000000;
		if(check) {
			StringBuilder sbch = new StringBuilder(new String());
			char[] chX = X.toCharArray();
			char[] chY = Y.toCharArray();
			String str = "";
			for(int i = 0; i < chX.length;i++) {
				for(int j = 0; j < chY.length;j++) {
					if(chX[i] == chY[j]) {
						sbch.append(chX);
						chX[i] = 0;
						chY[j] = 0;
						break;
					}
				}
			}
			System.out.println(sbch);
			char[] chArr = str.toCharArray();
			if(str.isEmpty()) {
				answer = "-1";
			} else if(Long.parseLong(str) == 0) {
				answer = "0";
			} else {
				Arrays.sort(chArr);
				StringBuilder sb = new StringBuilder(new String (chArr));
				sb.reverse();
				answer = String.valueOf(sb);
			}
		}
        return answer;
	}
}