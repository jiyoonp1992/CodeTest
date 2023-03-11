package Level1;

import java.util.Arrays;

public class level1_066 {
	//문자열 나누기
	public static void main(String[] args) {
		System.out.println(solution("abracadabra"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String s) {
        int answer = 0;
		boolean check = 1 <= s.length() && s.length() <= 10000;
		if(check) {
			char[] chArr = s.toCharArray();
			char ch = ' ';
			int x = 0, y = 0;
			for(int i = 0; i < chArr.length; i++) {
				if(ch ==  ' ') {
					ch = chArr[i];
					x++;
				} else {
					if(ch == chArr[i]) {
						x++;
					} else {
						y++;
					}
				}
				
				if(x != 0 && y != 0 && x == y || i == chArr.length - 1) {
					answer++;
					x = 0;
					y = 0;
					ch = ' ';
				}
			}
		}
        return answer;
	}
}