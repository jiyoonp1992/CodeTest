package Level0;

public class level0_16 {

	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(1));
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
		int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 100;
		if(check) {
			answer = n / 7;
			if(n%7 != 0) {
				answer++;
			}
		}
        return answer;
	}

}
