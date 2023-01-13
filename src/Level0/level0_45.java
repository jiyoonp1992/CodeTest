package Level0;

import java.util.Arrays;

public class level0_45 {
	//주사위의 개수
	public static void main(String[] args) {
		int[] num01 = {1, 1, 1};
		int[] num02 = {10, 8, 6};
		System.out.println(solution(num01, 1));
		System.out.println(solution(num02, 3));
	}
	
	public static int solution(int[] box, int n) {
        int answer = 0;
		boolean check = false;
		check = 1 <= n && n <= 50 && box.length == 3; 
		if(check) {
			answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		}
        return answer;
	}
}