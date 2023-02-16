package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_029 {
	//행렬의 덧셈
	public static void main(String[] args) {
		int[][] num01 = {{1,2},{2,3}};
		int[][] num02 = {{3,4},{5,6}};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01, num02)));
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length;i++) {
        	for(int j= 0; j < arr1[0].length;j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        return answer;
	}
}