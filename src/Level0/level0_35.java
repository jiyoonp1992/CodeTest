package Level0;

import java.util.Arrays;

public class level0_35 {
	//문자열안에 문자열
	public static void main(String[] args) {
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(solution("ppprrrogrammers", "pppp"));
		System.out.println(solution("AbcAbcA", "AAA"));
	}
	
	public static int solution(String str1, String str2) {
        int answer = 0;
		boolean check = false;
		check = 1 <= str1.length() && str1.length() <= 100 && 1<= str2.length() && str2.length() <= 100;
		if(check) {
			answer = str1.contains(str2) ? 1 : 2;
		}
        return answer;
	}
}