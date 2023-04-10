package Level2;

import java.util.Arrays;

public class level2_032 {
	//피로도
	public static void main(String[] args) {
		int[][] num01 = {{80,20},{30,10},{50,40}};
		System.out.println(solution(80, num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int k, int[][] dungeons) {
        int answer = 0;
        int[] tempArr = {0, 0};
        for(int i = 0; i < dungeons.length; i++) {
        	for(int j = i + 1 ; j < dungeons.length; j++) {
        		if(dungeons[i][0] < dungeons[j][0]) {
        			tempArr = dungeons[i];
        			dungeons[i] = dungeons[j];
        			dungeons[j] = tempArr;
        		} else if((dungeons[i][0] == dungeons[j][0])){
        			if(dungeons[i][1] < dungeons[j][1]) {
        				tempArr = dungeons[i];
            			dungeons[i] = dungeons[j];
            			dungeons[j] = tempArr;
        			}
        		}
        	}
        }
        
        for(int[] numArr : dungeons ) {
        	System.out.println(k);
        	if(k >= numArr[0]) {
        		k -= numArr[1];
        		answer++;
        	}
        }
        return answer;
	}
}