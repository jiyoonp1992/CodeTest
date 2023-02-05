package Level0;

import java.util.Arrays;

public class level0_90 {
	//저주의 숫자 3
	public static void main(String[] args) {
		System.out.println(solution(100));
		//System.out.println(solution(40));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 100;
		if(check) {
			for(int i = 1; i <= n; i++) {
				answer++;
				if(answer % 3 == 0) {
					answer++;
				} else if (answer / 10 == 3){
					answer++;
				}
				
				if((answer % 10) - 3 == 0) {
					i--;
				} else if (answer % 3 == 0) {
					i--;
				} else if (answer / 10 == 3) {
					i--;
				} else if ((answer / 10)%10 == 3) {
					i--;
				}
			}
		}
        return answer;
	}
}