package Level0;

import java.util.Arrays;

public class level0_83 {
	//직사각형 넓이 구하기
	public static void main(String[] args) {
		int[][] num01 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		int[][] num02 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
	}
	
	public static int solution(int[][] dots) {
        int answer = 0;
		boolean check = false;
		check = dots.length == 4;
		if(check) {
			int xMax = dots[0][0], xMin = dots[0][0], yMax = dots[0][1], yMin = dots[0][1];
			for(int[] num:dots) {
				xMax = Math.max(xMax, num[0]);
				xMin = Math.min(xMin, num[0]);
				yMax = Math.max(yMax, num[1]);
				yMin = Math.min(yMin, num[1]);
			}
			answer = (xMax - xMin) * (yMax - yMin); 
		}
        return answer;
	}
}