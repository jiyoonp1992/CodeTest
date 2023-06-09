package Level2;

import java.util.Arrays;

public class level2_056 {
	//쿼드압축 후 개수 세기
	public static void main(String[] args) {
		int[][] num = {{1,1,0,0}, {1,0,0,0}, {1,0,0,1}, {1,1,1,1}};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[][] arr) {
        int[] answer = {};
        answer = new int[2];
        int x = arr.length;
        int y = (int) (Math.log(x) / Math.log(2));
        for(int i = y; y != 0; y/=2) {
        	for(int j = 0; j < arr.length;) {
        		
        	}
        }
        return answer;
	}
}