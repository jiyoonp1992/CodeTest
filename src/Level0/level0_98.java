package Level0;

import java.util.Arrays;

public class level0_98 {
	//겹치는 선분의 길이
	public static void main(String[] args) {
		int[][] num01 = {{0, 1}, {2, 5}, {3, 9}};
		int[][] num02 = {{-1, 1}, {1, 3}, {3, 9}};
		int[][] num03 = {{0, 5}, {3, 9}, {1, 10}};
		System.out.println(solution(num01));
		//System.out.println(solution(num02));
		//System.out.println(solution(num03));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[][] lines) {
        int answer = 0;
		boolean check = false;
		check = true;
		if(check) {
			int x = 0, y= 0, cnt = 0;
			for(int[] num : lines) {
				x = Math.min(x, num[0]);
				y = Math.max(y, num[1]);
			}
			
			for(int k = x; k <= y; k++) {
				answer = lines[0][0] <= k && k <= lines[0][1] && lines[1][0] <= k && k <= lines[1][1]
						|| lines[0][0] <= k && k <= lines[0][1] && lines[2][0] <= k && k <= lines[2][1]
						|| lines[1][0] <= k && k <= lines[1][1] && lines[2][0] <= k && k <= lines[2][1] ? answer + 1:answer;
			}
		}
        return answer;
	}
}