package Level0;

import java.util.Arrays;

public class level0_49 {
	//문자열 정리하기
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("hi12392")));
		System.out.println(Arrays.toString(solution("p2o4i8gj2")));
		System.out.println(Arrays.toString(solution("abcde0")));
	}
	
	public static int[] solution(String my_string) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 100;
		if(check) {
			int j = 0;
			answer = new int[1];
			for(int i = 0; i < my_string.length(); i++) {
				if(Character.isDigit(my_string.charAt(i))) {
					answer = Arrays.copyOf(answer, j + 1);
					answer[j] = Character.getNumericValue(my_string.charAt(i));
					j++;
				}
			}
			Arrays.sort(answer);
		}
        return answer;
	}
}