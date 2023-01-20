package Level0;

import java.util.Arrays;

public class level0_64 {
	//2차원으로 만글디
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] num02 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		System.out.println(Arrays.toString(solution(num01, 2)));
		System.out.println(Arrays.toString(solution(num02, 3)));
	}
	
	public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int cnt = 0;
		boolean check = false;
		check = 0 <= num_list.length && num_list.length <= 150 && 2 <= n && n < num_list.length;
		if(check) {
			answer = new int[num_list.length/n][n];
			for(int i = 0; i < num_list.length/n; i++) {
				for(int j = 0; j < n;j++) {
					answer[i][j] = num_list[cnt];
					cnt++;
				}
			}
		}
        return answer;
	}
}