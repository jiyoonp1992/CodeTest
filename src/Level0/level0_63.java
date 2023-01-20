package Level0;

import java.util.Arrays;

public class level0_63 {
	//A를 B만들기
	public static void main(String[] args) {
		System.out.println(solution("olleh", "hello"));
		System.out.println(solution("allpe", "apple"));
	}
	
	public static int solution(String before, String after) {
        int answer = 0;
        int cnt = 0;
		boolean check = false;
		check = 0 < before.length() && before.length() == after.length() && after.length() <= 1000;
		if(check) {
			for(int i = 0; i < after.length(); i++) {
				for(int j = 0; j < after.length(); j++) {
					if(after.charAt(i) == after.charAt(j)){
						cnt--;
					}
					if(before.charAt(i) == after.charAt(j)) {
						cnt++;
					}
				}
			}
			if(cnt == 0) {
				answer = 1;
			}
		}
        return answer;
	}
}