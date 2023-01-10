package Level0;

public class level0_25 {
//편지
	public static void main(String[] args) {
		System.out.println(solution("happy birthday!"));
		System.out.println(solution("I love you~"));
	}
	
	public static int solution(String message) {
        int answer = 0;
		boolean check = false;
		check = 1<= message.length() && message.length() <= 50;
		if(check) {
			answer = message.length()*2;
		}
        return answer;
	}

}
