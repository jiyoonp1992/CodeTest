package Level0;

import java.util.Arrays;

public class level0_87 {
	//문자열 밀기
	public static void main(String[] args) {
		System.out.println(solution("hello", "ohell"));
		System.out.println(solution("apple", "elppa"));
		System.out.println(solution("atat", "tata"));
		System.out.println(solution("abc", "abc"));
		System.out.println(solution("abca", "aabc"));
	}
	
	public static int solution(String A, String B) {
        int answer = 0;
		boolean check = false;
		check = 0 < A.length() && A.length() == B.length() && A.length() < 100;
		if(check) {
			if(A.equals(B)) {
				answer = 0;
			} else {
				A += A;
				answer = A.contains(B)?0:-1;
				if(answer == 0) {
					for(int i = 0; i < B.length(); i++) {
						if(B.equals(A.substring(A.length()-1-B.length()-i, A.length()-1-i))) {
							answer = i + 1;
							break;
						}
					}
				}
			}
		}
        return answer;
	}
}