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
		boolean check = false;
		check = 0 < before.length() && before.length() == after.length() && after.length() < 1000;
		if(check) {
			String str = "";
			for(int i = after.length() - 1; i >= 0; i--) {
				str += after.charAt(i);
			}
			if(before.equals(str)) {
				answer++;
			}
		}
        return answer;
	}
}