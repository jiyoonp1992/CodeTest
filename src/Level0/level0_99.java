package Level0;

import java.util.Arrays;

public class level0_99 {
	//평행
	public static void main(String[] args) {
		int[][] num01 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		int[][] num02 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[][] dots) {
        int answer = 0;
		boolean check = false;
		check = dots.length == 4;
		if(check) {
			answer = (double) Math.abs(dots[0][1] - dots[1][1]) / Math.abs(dots[0][0] - dots[1][0]) == (double) Math.abs(dots[2][1] - dots[3][1]) /  Math.abs(dots[2][0] - dots[3][0])
					|| (double) Math.abs(dots[0][1] - dots[2][1]) / Math.abs(dots[0][0] - dots[2][0]) == (double) Math.abs(dots[1][1] - dots[3][1]) / Math.abs(dots[1][0] - dots[3][0])
					|| (double) Math.abs(dots[0][1] - dots[3][1]) / Math.abs(dots[0][0] - dots[3][0]) == (double) Math.abs(dots[1][1] - dots[2][1]) / Math.abs(dots[1][0] - dots[2][0]) ? 
							++answer:answer; 
		}
        return answer;
	}
}