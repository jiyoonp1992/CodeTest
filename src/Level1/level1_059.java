package Level1;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class level1_059 {
	//숫자 짝꿍
	public static void main(String[] args) {
		//System.out.println(solution("5525", "1255" ));
		System.out.println(solution("123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123", "123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123" ));
		//System.out.println(solution("12321", "42531" ));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String X, String Y) {
        String answer = "";
		boolean check = 3 <= X.length() && X.length() <= 3000000 && 3 <= Y.length() && Y.length() <= 3000000;
		if(check) {
			StringBuilder sb = new StringBuilder(new String());
			int[] chX = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int[] chY = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			String str = "";
			int cnt = 0;
			for(int i = 0; i < Math.max(X.length(), Y.length()) ; i++) {
				if(i < X.length()) {
					chX[X.charAt(i) - 48]++;
				}
				if(i < Y.length()) {
					chY[Y.charAt(i) - 48]++;
				}
			}
			for(int j = 0; j <= 9; j++) {
				if(chX[j] != 0 && chY[j] != 0) {
					for(int k = 0; k < Math.min(chX[j], chY[j]); k++) {
						if(j == 0) {
							cnt++;
						}
						sb.append(j);
					}
				}
			}
			str = sb.toString();
			char[] chArr = str.toCharArray();
			Arrays.sort(chArr);
			sb = new StringBuilder(new String(chArr));
			if(str.length() == 0) {
				answer = "-1";
			} else if (str.length() == cnt) {
				answer = "0";
			} else {
				answer = sb.reverse().toString();
			}
		}
		return answer;
	}
}