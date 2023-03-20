package Level2;

import java.util.Arrays;

public class level1_075 {
	//당구 연습
	public static void main(String[] args) {
		int[][] num01 = {{7, 7}, {2, 7}, {7, 3}};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(10, 10, 3, 7, num01)));
	}
	
	public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = {};
        answer = new int[balls.length];
        int x = 0, y = 0;
        for(int i = 0; i < answer.length; i++) {
        	// x y 기준잡고 가까운쪽으로 변호나

        }
        return answer;
	}
}