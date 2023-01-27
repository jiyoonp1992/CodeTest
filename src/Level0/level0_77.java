package Level0;

import java.util.Arrays;

public class level0_77 {
	//구슬을 나누는 경우의 수
	public static void main(String[] args) {
		//System.out.println(solution(3,2));
		//System.out.println(solution(1,1));
		//System.out.println(solution(5,3));
		//System.out.println(solution(3,2));
		//System.out.println(factorial(15));
//		for(int i = 1; i <= 15; i++) {
//			for(int j = 1; j <= 15; j++) {
//				System.out.println("j = " + j + ", i = " + i + ", answer = " + solution(j,i));
//			}
//		}
		
		long cnt = 1;
		for(int i = 1; i <= 30; i++) {
			cnt *= i;
		}
		System.out.println(cnt);
		
	}
	
	public static int solution(int balls, int share) {
        int answer = 0;
        int sum = 0;
		boolean check = false;
		check = 1 <= balls && balls <= 30 && 1 <= share && share <= 30 && share <= balls;
		if(check) {
			if(balls == share) {
				answer = 1;
			} else {
				answer = 1;
				sum = balls - share;
				for(int i = 0; i < balls; i++) {
					share = (i >= share)?1:share - i;
					sum = (i >= sum)?1:sum - i;
					answer = Math.round(answer*(balls - i)/(share)/(sum));
					System.out.println(i);
					System.out.println(share);
					System.out.println(balls);
					System.out.println(sum);
					System.out.println(answer);
					System.out.println("------------------");
				}
			}
		}
        return answer;
	}
}