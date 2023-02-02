package Level0;

import java.util.Arrays;

public class level0_85 {
	//치킨 쿠폰
	public static void main(String[] args) {
		//System.out.println(solution(100));
		//System.out.println(solution(1081));
		//System.out.println(solution(0));
		//System.out.println(solution(2));
//		for(int i = 0; i <= 500; i++) {
//			System.out.println(i + " = " + solution(i));
//		}
		//System.out.println(solution(1999));
		System.out.println(solution(2));
	}
	
	public static int solution(int chicken) {
        int answer = -1;
        Boolean check = false;
		check = 0 <= chicken && chicken <= 1000000;
		if(check) {
			for(int i = 10; i <= chicken;) {
				int num = 0;
				answer += chicken / 10;
				num += chicken % 10;
				chicken = chicken/10+chicken % 10;
			}
			answer++;
		}
        return answer;
	}
}