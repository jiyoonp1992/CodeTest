package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_038 {
	//최소직사각형
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[][] sizes) {
        int answer = 0;
		boolean check = 1 <= sizes.length && sizes.length <= 10000;
		if(check) {
			int w = 0, h = 0;
			for(int i = 0; i < sizes.length; i++) {
				w = Math.max(w, Math.max(sizes[i][0], sizes[i][1]));
				h = Math.max(h, Math.min(sizes[i][0], sizes[i][1]));
			}
			answer = w * h;
		}
        return answer;
	}
}