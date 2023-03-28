package Level2;

import java.util.Arrays;

public class level2_021 {
	//행렬의 곱셈
	public static void main(String[] args) {
		int[][] num01 = {{1, 4}, {3, 2}, {4, 1}};
		int[][] num02 = {{3, 3}, {3, 3}};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01, num02)));
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j < answer[0].length;j++) {
        		for(int n = 0; n < arr2.length;n++) {
        			answer[i][j] += arr1[i][n] * arr2[n][j];
        		}
        	}
        }
        return answer;
	}
}