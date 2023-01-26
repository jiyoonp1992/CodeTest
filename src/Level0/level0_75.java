package Level0;

import java.util.Arrays;

public class level0_75 {
	//잘라서 배열로 저장하기
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("abc1Addfggg4556b",6)));
		System.out.println(Arrays.toString(solution("abcdef123",3)));
	}
	
	public static String[] solution(String my_str, int n) {
        String[] answer = {};
		boolean check = false;
		check = 1 <= my_str.length() && my_str.length() <= 100 && n <= my_str.length();
		if(check) {
			answer = (my_str.length()%n == 0)?new String[my_str.length()/n]:new String[my_str.length()/n+1];
			for(int i = 0; i < answer.length; i++) {
				if(my_str.length() >= n) {
					answer[i] = my_str.substring(0, n);
					my_str = my_str.substring(n);
				} else {
					answer[i] = my_str;
				}
			}
		}
        return answer;
	}
}