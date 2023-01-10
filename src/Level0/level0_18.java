package Level0;

public class level0_18 {

	public static void main(String[] args) {
		String[] str = {"We", "are", "the", "world!"};
		String[] str2 = {"I", "Love", "Programmers."};
		System.out.println(solution(str));
		System.out.println(solution(str2));
	}
	
	public static int[] solution(String[] strlist) {
		int[] answer = {};
		boolean check = false;
		answer = new int[strlist.length];
		int cnt = 0;
		for(String srt : strlist) {
			answer[cnt] = srt.length();
			cnt++;
		}
        return answer;
	}

}
