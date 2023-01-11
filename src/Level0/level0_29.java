package Level0;

public class level0_29 {
	//문자출력반복하기
	public static void main(String[] args) {
		System.out.println(solution("hello", 3));
	}
	
	public static String solution(String my_string, int n) {
        String answer = "";
		boolean check = false;
		check = 2 <= my_string.length() && my_string.length() <= 5 && 2 <= n && n <= 10;
		if(check) {
			for(int i = 0; i <= my_string.length() - 1; i++) {
				for(int j = 1; j <= n; j++) {
					answer += my_string.charAt(i);
				}
			}
		}
        return answer;
	}
}