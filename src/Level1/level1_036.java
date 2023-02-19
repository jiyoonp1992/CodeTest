package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_036 {
	//시저암호
	public static void main(String[] args) {
		//System.out.println(solution("AB", 1));
		//System.out.println(solution("A B", 1));
		System.out.println(solution("Z", 1));
		System.out.println(solution("Z", 2));
		System.out.println(solution("Z", 3));
		System.out.println(solution("Z", 4));
		System.out.println(solution("Z", 5));
		System.out.println(solution("Z", 6));
		System.out.println(solution("Z", 7));
		System.out.println(solution("Z", 8));
		System.out.println(solution("Z", 9));
		System.out.println(solution("Z", 10));
		System.out.println(solution("Z", 11));
		System.out.println(solution("Z", 12));
		System.out.println(solution("Z", 13));
		System.out.println(solution("Z", 14));
		System.out.println(solution("Z", 15));
		System.out.println(solution("Z", 16));
		System.out.println(solution("Z", 17));
		System.out.println(solution("Z", 18));
		System.out.println(solution("Z", 19));
		System.out.println(solution("Z", 20));
		System.out.println(solution("Z", 21));
		System.out.println(solution("Z", 22));
		System.out.println(solution("Z", 23));
		System.out.println(solution("Z", 24));
		//solution("a", 2);
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s, int n) {
        String answer = "";
		boolean check = s.length() <= 8000 && 1 <= n && n <= 25;
		if(check) {
			char[] arr = s.toCharArray();
			for(char ch : arr) {
				if(ch == ' ') {
					ch = ' ';
				} else if (65 <= ch && ch <= 90){
					if(90 < ch + n) {
						ch = (char) (ch + n - 26);
					} else {
						ch = (char) (ch + n) ;
					}
				} else if (97 <= ch && ch <= 122){
					if(122 < ch + n) {
						ch = (char) (ch + n - 26);
					} else {
						ch = (char) (ch + n) ;
					}
				}
					
				answer += ch;
			}
		}
        return answer;
	}
}
	
