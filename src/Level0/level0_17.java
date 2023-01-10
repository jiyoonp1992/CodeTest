package Level0;

public class level0_17 {

	public static void main(String[] args) {
		System.out.println(solution(7,10));
		System.out.println(solution(4,12));
	}
	
	public static double solution(int slice, int n) {
		int answer = 0;
		boolean check = false;
		check = 2 <= slice && slice <=10 && 1 <= n && n <= 100;
		if(check) {
			answer = n / slice;
			if(n%slice != 0) {
				answer++;
			}
		}
        return answer;
	}

}
