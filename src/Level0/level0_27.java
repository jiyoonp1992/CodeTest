package Level0;

public class level0_27 {
	//특정 문자 제거
	public static void main(String[] args) {
		System.out.println(solution("abcdef", "f"));
		System.out.println(solution("BCBdbe", "B"));
	}
	
	public static String solution(String my_string, String letter) {
        String answer = "";
		boolean check = false;
		check = 1 <= my_string.length() && my_string.length() <= 100 && letter.length() == 1;
		if(check) {
			answer = my_string.replace(letter, "");
		}
        return answer;
	}

}
