package Level0;

public class level0_24 {
//문자열뒤집기
	public static void main(String[] args) {
		System.out.println(solution("jaron"));
		System.out.println(solution("bread"));
	}

	public static String solution(String my_string) {
		String answer = "";
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 1000;
		if(check) {
			for(int i = my_string.length() - 1 ; i >= 0; i--) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}

}
