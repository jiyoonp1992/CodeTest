package Level0;

import java.util.Arrays;

public class level0_88 {
	//등수 매기기
	public static void main(String[] args) {
		int[][] sco01 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int[][] sco02 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		System.out.println(Arrays.toString(solution(sco01)));
		System.out.println(Arrays.toString(solution(sco02)));
	}
	
	public static int[] solution(int[][] score) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= score.length && score.length <= 10;
		if(check) {
			int[] sum = {};
			sum = new int [score.length]; 
			answer = new int [score.length];
			for(int i = 0; i < sum.length; i++) {
				sum[i] = score[i][0] + score[i][1]; 
			}
			int rank = 0; 
			for(int j = 0; j < sum.length; j++) {
				rank = sum.length;
				for(int k = 0; k < sum.length; k++) {
					if(sum[j] > sum[k]) {
						rank--;
					} else if(sum[j] == sum[k] && j != k) {
						rank--;
					}
				}
				answer[j] = rank;
			}
		}
        return answer;
	}
}